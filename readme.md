# Projeto de Automacao de Testes - Amazon Brasil

## 📌 Descrição

Este repositório contém testes automatizados para validar a página inicial da **Amazon Brasil**. O projeto utiliza **Java, Selenium, TestNG, Cucumber e Allure Reports**, além de integração contínua via **GitHub Actions**.

## 🚀 Tecnologias Utilizadas

- **Java 11**
- **Selenium WebDriver**
- **TestNG**
- **Cucumber (BDD em Português)**
- **Page Object Model (POM)**
- **Allure Reports** (Geração de relatórios de execução)
- **Maven** (Gerenciador de dependências e build)
- **GitHub Actions** (CI/CD para execução dos testes automatizados)

## 📂 Estrutura do Projeto

```
📂 code-frontend-tests/
├── 📂 src/
│   ├── 📂 test/
│   │   ├── 📂 java/pages/        # Page Objects
│   │   ├── 📂 java/steps/        # Step Definitions do Cucumber
│   │   ├── 📂 java/runners/      # Runner do Cucumber
│   │   ├── 📂 java/features/     # Cenários de Teste (BDD)
├── 📂 reports/                   # Relatórios de teste
├── 📂 .github/
│   ├── 📂 workflows/
│   │   ├── selenium-tests.yml    # CI/CD com GitHub Actions
├── pom.xml                        # Configuração do Maven
├── README.md
```

## 📝 Instalação e Configuração

### 1️⃣ Pré-requisitos

Certifique-se de ter instalado:

- **Java 11**
- **Maven**
- **ChromeDriver** compatível com seu navegador
- **Allure CLI** para visualização dos relatórios (`npm install -g allure-commandline`)

### 2️⃣ Clone o repositório

```sh
git clone https://github.com/LeandroStevanatoAlves/code-frontend-tests.git
cd amazon-test-automation
```

### 3️⃣ Instale as dependências

```sh
mvn clean install -DskipTests
```

## 🎯 Execução dos Testes

### ✅ Rodando os testes localmente

```sh
mvn test
```

### 📊 Gerando Relatórios Allure

```sh
mvn allure:report
allure serve target/site/allure-maven
```

## 🛠️ Integração com CI/CD (GitHub Actions)

Os testes são executados automaticamente no **GitHub Actions** a cada `push` ou `pull request`. O fluxo de CI/CD está definido em `.github/workflows/selenium-tests.yml`.

Para visualizar os relatórios:

1. Vá até **Actions** no GitHub.
2. Escolha o workflow **Selenium Tests**.
3. Baixe os relatórios em **Artifacts > allure-report**.
