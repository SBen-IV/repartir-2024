# language: es

Característica: Crear Grupo para repartir gastos

  Regla: Los grupos están compuestos por al menos dos miembros

    Escenario: No puedo crear un grupo con un único miembro
      Cuando el usuario intenta crear un grupo indicando un único miembro
      Entonces no debería crear el grupo con un único miembro

  Regla: El total de un grupo no debe ser negativo

    @pendiente
    Escenario: El total de un grupo nunca es menor a $ 0
      Dado existe un grupo con monto total $ 0.0
      Cuando el usuario agrega un monto de $ -100.0
      Entonces el nuevo monto debería ser $ 0.0

    @pendiente
    Escenario: El total de un grupo es siempre positivo
      Dado existe un grupo con monto total $ 0.0
      Cuando el usuario agrega un monto de $ 100.0
      Entonces el nuevo monto debería ser $ 100.0
