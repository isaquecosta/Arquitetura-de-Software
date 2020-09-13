package io.swagger.api;

import io.swagger.model.Conta;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-09-09T16:43:29.646Z")

@Controller
public class ContaApiController implements ContaApi {

    private static final Logger log = LoggerFactory.getLogger(ContaApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContaApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Conta>> contaGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Conta>>(objectMapper.readValue("[ {  \"numConta\" : 0,  \"cpf\" : 1,  \"saldo\" : 5.962133916683182377482808078639209270477294921875,  \"agencia\" : 6,  \"titular\" : \"titular\"}, {  \"numConta\" : 0,  \"cpf\" : 1,  \"saldo\" : 5.962133916683182377482808078639209270477294921875,  \"agencia\" : 6,  \"titular\" : \"titular\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Conta>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Conta>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contaIdDelete(@ApiParam(value = "id da conta",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contaIdGet(@ApiParam(value = "id da conta",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> contaIdPut(@ApiParam(value = "id da conta",required=true) @PathVariable("id") Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Conta> contaPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Conta conta) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Conta>(objectMapper.readValue("{  \"numConta\" : 0,  \"cpf\" : 1,  \"saldo\" : 5.962133916683182377482808078639209270477294921875,  \"agencia\" : 6,  \"titular\" : \"titular\"}", Conta.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Conta>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Conta>(HttpStatus.NOT_IMPLEMENTED);
    }

}
