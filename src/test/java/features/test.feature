Feature: Categoria comics
  como usuario quiero leer chistes de testers para reirme
  y pasar un buen rato

  Scenario: Ingresar a la categoria comics desde la pantalla home

    Given el usuario se encuentra en la pagina home de  imalittletesters
    When  hace click en el boton de The little tester comics
    Then se debe rederigir a la pantalla donde hay un listado de comics
