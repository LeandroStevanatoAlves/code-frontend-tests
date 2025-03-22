# language: pt
Funcionalidade: Sugestões de Pesquisa

  Como um usuário da Amazon
  Quero receber sugestões ao digitar na barra de pesquisa
  Para encontrar produtos mais facilmente

  Cenário: Exibir sugestões ao digitar um termo válido
    Dado que estou na página inicial da Amazon
    Quando digito "notebook" na barra de pesquisa
    Então vejo sugestões relacionadas ao termo "notebook"

  Cenário: Nenhuma sugestão ao digitar um termo inválido
    Dado que estou na página inicial da Amazon
    Quando digito "@#$$$" na barra de pesquisa
    Então não vejo sugestões exibidas