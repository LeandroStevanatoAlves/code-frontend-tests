# language: pt
Funcionalidade: Menu de Navegação

  Como um usuário da Amazon
  Quero acessar o menu de navegação
  Para encontrar categorias de produtos e páginas rapidamente

  Cenário: O menu é responsivo em dispositivos mobile
    Dado que estou na página inicial da Amazon
    Quando altero o tamanho da janela para "mobile"
    Então o menu é exibido corretamente

  Cenário: O menu é responsivo em tablets
    Dado que estou na página inicial da Amazon
    Quando altero o tamanho da janela para "tablet"
    Então o menu é exibido corretamente