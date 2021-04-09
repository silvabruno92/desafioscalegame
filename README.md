# desafioscalegame

(Back-end) Desafio Game Scale

Este projeto Java Back-End foi criado na IDE Eclipse do Spring, o Spring Tools Suite 4.

- Obs.: Ao criar os arquivos de implantação, percebi que tanto o jar executavel, quanto o war de deploy eram
maiores que os 25mb permitidos aqui. -- A build será feita com Maven --

- Para altenar entre a criação de um arquivo ".jar" e um ".war", basta ir ao arquivo "pom.xml" e alterar
o  packaging war <--> packaging jar (linha 14)

-- Utilizando a linha de comando, acesse a pasta que contém o projeto salvo. Faça a build com o comando "mvn package".
(ela sera criada dentro da pasta target)

- O .jar é melhor executado pela linha de comando "java -jar projeto.jar"
- O .war pode ser executado com o Apache Tomcat. Basta inseri-lo na pasta "webapps" do Tomcat e iniciar o servidor (arquivo "startup" pasta "bin").

--O projeto DEVE acessado pelo link: "http://localhost:8080/desafioscale/desafio/" - a porta 8080 foi utilizada como referência para o Front-End.
Caso inicie em uma diferente, ela deve ser editada no arquivo "server" da pasta "conf". --

-- Outra opção é copiar o projeto deste repository e rodar na sua IDE.

-Também estou compartilhando o arquivo .jar que criei pelo Drive:
https://drive.google.com/drive/folders/1jEwxrgJ8FLhBkDF-Iiz6rhBymVfWDIYb?usp=sharing

