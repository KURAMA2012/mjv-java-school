package src.main.java.com.mjv.pedidofast.model;




import java.time.LocalDate;
import java.util.List;

import com.mjv.pedidofast.model.Cliente;
import com.mjv.pedidofast.model.ItemPedido;

import lombok.Data;


@Data
public class Pedido {

    private Long id;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private LocalDate dataVenda;
    private String tipoPagamento;
    
}
