#language: es

@Compras
Característica: Realizar compra de articulos

  @CompraExitosa
   Esquema del escenario: Compra de celular exitosa
    Dado que Camilo quiere comprar un producto en la pagina demoblaze
    Cuando compra un celular
      |producto|nombre|pais|ciudad|tarjeta|mes|ano|
      |<producto>|<nombre>|<pais>|<ciudad>|<tarjeta>|<mes>|<ano>|
    Entonces se debe visualizar en pantalla Thank you for your purchase!

    Ejemplos:
      |producto| nombre |pais| ciudad | tarjeta | mes | ano |
      |Iphone 6 32gb|Camilo|Colombia|medellin|abc123|11|20|