package edu.unisabana.dyas.sampleprj.dao.mybatis.mappers;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import edu.unisabana.dyas.samples.entities.Cliente;

/**
 *
 * @author cesarvefe
 */
public interface ClienteMapper {
    
    public Cliente consultarCliente(@Param("idcli") int id);
    

    
    /**
     * Registrar un nuevo item rentado asociado al cliente identificado
     * con 'idc' y relacionado con el item identificado con 'idi'
     * @param id
     * @param idit
     * @param fechainicio
     * @param fechafin 
     */
    public void agregarItemRentadoACliente(@Param("idcli")int id, 
    @Param("idit")int idit, 
    @Param("fechainicio")String fechainicio,
    @Param("fechafin")String fechafin);

    /**
     * Consultar todos los clientes
     * @param i 
     * @return 
     */
    public List<Cliente> consultarClientes(int i);
    
}
