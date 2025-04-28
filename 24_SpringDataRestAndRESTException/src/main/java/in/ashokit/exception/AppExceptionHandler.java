package in.ashokit.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExInfo> handleException(Exception ex){
		String message = ex.getMessage();
		
		ExInfo e = new ExInfo();
		e.setExCode("EX0007");
		e.setExMsg(message);
		e.setExDate(LocalDate.now());
		
		return new ResponseEntity<ExInfo>(e,HttpStatus.BAD_GATEWAY);
	}
	
	
	@ExceptionHandler(value = EmpNotFoundException.class)
	public ResponseEntity<ExInfo> handleEmpException(EmpNotFoundException ex) {
		
		String message = ex.getMessage();
		ExInfo e = new ExInfo();
		e.setExCode("EX001");
		e.setExMsg(message);
		e.setExDate(LocalDate.now());
		
		return new ResponseEntity<ExInfo>(e,HttpStatus.NOT_FOUND);
		
	}

}
