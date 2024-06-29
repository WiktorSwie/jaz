package com.example.jaz_s27293_nbp;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@RestController
@RequestMapping("https://api.nbp.pl/api/")
public class ApiController {

 //   private final WalutoweRepository walutoweRepository;

 //   public ApiController(WalutoweRepository walutoweRepository) {
 //       this.walutoweRepository = walutoweRepository;
 //   }

    @Operation(description = "ten endpoint pozwala na obliczenie sredniej wartości waluty na przedziale dat")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "zwraca informacj,że endpoint zadziałał poprawnie"),
            @ApiResponse(responseCode = "400", description = "zwraca informacje,że podano błędne dane")
    })
    @PostMapping("/{table}/{code}/{startDate}/{endDate}")
        public ResponseEntity<Object> obliczwalute(@RequestBody SredniaWaluta waluta) {
        LocalDate endDate = waluta.getData_koncowa();
        LocalDate startDate = waluta.getData_rozpoczynajaca();
        if (endDate.isAfter(startDate)) {

            return ResponseEntity.ok(waluta);
        } else {
        return ResponseEntity.badRequest().body(waluta);
        }
    }
  //  @Operation(description = "ten endpoint znajduje sredniawalute po typie waluty")
//@ApiResponses(value = {
   //         @ApiResponse(responseCode = "200", description = "zwraca informacje,że endpoint zadziałał poprawnie"),
   // })
   // @GetMapping("/{waluta}")
   // public ResponseEntity<SredniaWaluta> exception(@PathVariable String waluta) {
   //     SredniaWaluta sredniaWaluta = walutoweRepository.findBy(waluta);
   //     return ResponseEntity.ok(sredniaWaluta);
   // }
}
