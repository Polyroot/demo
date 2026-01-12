package com.example.computershop;


import com.example.specs.generated.api.HelloApi;
import com.example.specs.generated.model.HelloResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiImpl implements HelloApi {

    @Override
    public ResponseEntity<HelloResponseDto> getHello() {
        HelloResponseDto response = new HelloResponseDto();
        response.setMessage("Hello buddy");
        return ResponseEntity.ok(response);
    }

}
