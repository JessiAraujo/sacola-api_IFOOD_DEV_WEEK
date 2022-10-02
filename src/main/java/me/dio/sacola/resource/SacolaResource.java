package me.dio.sacola.resource;

import lombok.RequiredArgsConstructor;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.repository.ProdutoRepository;
import me.dio.sacola.resource.dto.ItemDto;
import me.dio.sacola.service.SacolaService;
import org.springframework.web.bind.annotation.*;


@Api(value="/ifood-devweek/sacolas")
@RestController
@RequestMapping("/ifood-devweek/sacolas")
@RequiredArgsConstructor
public class SacolaResource {
private final SacolaService sacolaservice;
private final ProdutoRepository produtoRepository;


    @PostMapping
public Item incluirItemNaSacola(@RequestBody ItemDto ItemDto) {
return sacolaservice.incluirItemNaSacola(ItemDto);
    }

    @GetMapping("/{id}")
public Sacola verSacola(@PathVariable ("id") Long id){
return sacolaservice.verSacola(id);
}

@PatchMapping ("/fecharSacola/{sacolaId}")
public Sacola fecharSacola (@PathVariable("sacolaId") Long sacolaId,
                            @RequestParam("formaPagamento") int FormaPagamento){

  return sacolaservice.fecharSacola(sacolaId, FormaPagamento);
}
}