package henrique.vale.football.players.payment.control.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players-payment")
public class PlayersPaymentController {

    @GetMapping()
    public ResponseEntity getPaymentPlayers (){
        return ResponseEntity.ok("Retorno com sucesso");
    }
}
