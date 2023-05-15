#language: es
  #author: Camilo Garcia

  Característica: Como usuario de bloc de notas online
    deseo agregar una nota con texto enriquecido
    para guardarla en mi computador

  Esquema del escenario: Crear nueva nota texto enriquecido Exitosamente
    Dado que "camilo" ingresa ala web "https://www.online-notepad.net/es/bloc-de-notas-online"
    Cuando ingresa una nueva nota
      |nota |
      |<nota> |
    Entonces debera poder guardar la nota

    Ejemplos:
      |nota |
      |Texto para la prueba tecnica |
