Algoritmo "Sistema de Cadastro"
// Descrição   : Cadastro de Clientes 0,0,1 e consulta de destinos
// Autor(a)    : Gilson de LIma
// Data atual  : 25/6/2022

//Definindo o tipos cliente e destino
tipo
   cliente=registro
      nome: caractere
      cpf:caractere
      idade:caractere
   fimregistro

   destino=registro
      estado:caractere
      cidade:caractere
      valor:real
   fimregistro

Var
   // Seção de Declarações das variáveis
   clientes: vetor[1..5] de cliente
   destinos: vetor[1..5] de destino
   opcaoMenu: inteiro
   sairSistema: logico
   contadorCliente: inteiro
   contadorDestino: inteiro
   cpf: caractere
   estado: caractere

   //Procedimento que exibe cabeçalho
procedimento cabecalho
inicio

   escreval("##############################")
   escreval("-- NG VIAGENS - SISTEMA 0.1 --")
   escreval("##############################")

fimprocedimento

//Funçao que aguarda operaçao do usuario
procedimento menu
inicio

   escreval()
   escreval("( 1 ) CADASTRAR CLIENTE")
   escreval("( 2 ) CONSULTAR CLIENTE")
   escreval("( 3 ) CADASTRAR DESTINO")
   escreval("( 4 ) CONSULTAR DESTINO")
   escreval("( 0 ) SAIR DO PROGRAMA")
   escreval()
   escreva("Selecione a opçao desejada: ")
fimprocedimento

//Funçao de cadastro de clientes
procedimento cadcliente
var continuar: caractere
inicio
   continuar <- "n"
   escreval()
   escreval("SEÇAO - CADASTRO DE CLIENTES")
   escreval()
   para contadorCliente de 1 ate 5 faca
      escreva("Digite o nome do cliente: ")
      leia(clientes.nome[contadorCliente])
      escreva("Digite o CPF do cliente: ")
      leia(clientes.cpf[contadorCliente])
      escreva("Digite a idade do cliente: ")
      leia(clientes.idade[contadorCliente])

      //Verifica se o usuario quer cadastrar outro cliente
      escreva("Cadastrar outro cliene:(S/N) ")
      leia(continuar)
      se continuar = "n" entao
         interrompa
      fimse

   fimpara
fimprocedimento

//Funçao de cadastro de destino
procedimento caddestino
var continuar: caractere
inicio
   continuar <- "n"
   escreval()
   escreval("SEÇAO - CADASTRO DE DESTINO")
   escreval()
   para contadorDestino de 1 ate 5 faca
      escreva("Digite o nome do estado: ")
      leia(clientes.nome[contadorDestino])
      escreva("Digite o nome da cidade: ")
      leia(clientes.cpf[contadorDestino])
      escreva("Digite o valor da passagem: ")
      leia(clientes.idade[contadorDestino])

      //Verifica se o usuario quer cadastrar outro destino
      escreva("Cadastrar outro destino:(S/N) ")
      leia(continuar)
      se continuar = "n" entao
         interrompa
      fimse

   fimpara
fimprocedimento

//Funçao de consulta do cliente
procedimento consultacliente
var continuar: caractere
inicio
   continuar <- "n"
   escreval()
   escreval("SEÇAO - CONSULTA DE CLIENTE")
   escreval()
   escreva("DIGITE O CPF DO CLIENTE: ")
   leia(cpf)
   para contadorCliente de 1 ate 5 faca
      se cpf = clientes.cpf[contadorCliente] entao
         escreval("--------------cliente-------------")
         escreval("Nome: "+clientes.nome[contadorCliente])
         escreval("CPF:"+clientes.cpf[contadorCliente])
         escreval("Idade: "+clientes.idade[contadorCliente])
      fimse

      //Verifica se o usuario quer consultar outro cliente
      escreva("Cadastrar outro cliente:(S/N) ")
      leia(continuar)
      se continuar = "n" entao
         interrompa
      fimse

   fimpara
fimprocedimento

//Funçao de consulta do destino
procedimento consultadestino
var continuar: caractere
inicio
   continuar <- "n"
   escreval()
   escreval("SEÇAO - CONSULTA DE DESTINO")
   escreval()
   escreva("DIGITE O NOME DO ESTADO: ")
   leia(estado)
   para contadorDestino de 1 ate 5 faca
      se estado = destino.estado[contadorDestino] entao
         escreval("--------------Destino-------------")
         escreval("Estado: "+destino.estado[contadorDestino])
         escreval("Cidade:"+destino.cidade[contadorDestino])
         escreval("Valor:"+destino.valor[contadorDestino])
      fimse

      //Verifica se o usuario quer consultar outro destino
      escreva("Consultar outro estado:(S/N) ")
      leia(continuar)
      se continuar = "n" entao
         interrompa
      fimse

   fimpara
fimprocedimento


Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   sairSistema <- falso
   cabecalho()

   //Verifica se o usuario selecionou a opcao correta
   enquanto sairSistema <> verdadeiro faca
      menu()
      leia(opcaoMenu)
      se opcaoMenu = 0 entao
         sairSistema <- verdadeiro
      senao
         se (opcaoMenu >= 1) e (opcaoMenu <= 5) entao
            se (opcaoMenu = 1) entao
               cadcliente()
            fimse
            se (opcaoMenu = 2) entao
               consultacliente()
            fimse
            se (opcaoMenu = 3) entao
               caddestino()
            fimse
            se (opcaoMenu = 4) entao
               consultadestino()
            fimse
         fimse
      fimse
   fimenquanto
Fimalgoritmo