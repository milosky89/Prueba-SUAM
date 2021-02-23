#language: es

@stories

Característica: Realizar compra de celular
  Yo como usuario
  Quiero seleccionar un celular
  para comprar

  @scenario1

  Escenario: Compra de celular exitosa
    Dado que Camilo quiere buscar celulares en la pagina
    Cuando compra un celular
    Entonces se debe visualizar en pantalla Thank you for your purchase!
