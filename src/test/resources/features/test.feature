#author: Luis Arias
#language: es


Característica: Agregar productos al carrito de compras

  @RUN
  Escenario: Agregar 1 producto con 2 cantidades al carrito de compras
    Dado "Luis" ingresa el sitio web
    Y selecciona un producto e ingresa dos cantidades
    Cuando selecciona la opcion "añadir al carrito"
    Entonces se visualizara el producto con la cantidad


  @RUN
  Escenario: Agregar 2 producto con 5 cantidades al carrito de compras
    Dado "Luis" ingresa el sitio web
    Y selecciona dos producto e ingresa 5 cantidades
    Cuando selecciona la opcion "añadir al carrito"
    Entonces se visualizara los productos con las cantidad