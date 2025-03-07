    select
    c.nombre AS 'Nombre_Cliente',
    c.documento,
    c.telefono,
    c.direccion,
    c.email,
    c.vetado,
    ir.ITEMS_id ,
    ir.fechainiciorenta ,
    ir.fechafinrenta ,
    i.id AS 'ID_Item',
    i.nombre AS 'Nombre_Item',
    i.descripcion AS 'Descripcion_Item' ,
    i.fechalanzamiento ,
    i.tarifaxdia ,
    i.formatorenta ,
    i.genero ,        
    ti.id AS 'ID_Tipo_Item',
    ti.descripcion AS 'Descripcion_Tipo_Item' 
    FROM VI_CLIENTES as c 
    left join VI_ITEMRENTADO as ir on c.documento=ir.CLIENTES_documento 
    left join VI_ITEMS as i on ir.ITEMS_id=i.id 
    left join VI_TIPOITEM as ti on i.TIPOITEM_id=ti.id 
