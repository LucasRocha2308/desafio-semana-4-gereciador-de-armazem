# desafio-semana-4-gereciador-de-armazem

EXERCÍCIOS PRÁTICOS - Semana 4



## 1- Construa um projeto do zero, utilizando Apache Maven. Pode ser um projeto simples da sua escolha, não há pré-requisitos, apenas deve ser um projeto que utiliza o Maven.

### Para construir o projeto

mvn archetype:generate                                  \
  -DinteractiveMode=false                               \
  -DarchetypeArtifactId=maven-archetype-quickstart      \
  -DarchetypeVersion=1.4                                \
  -DgroupId=br.com.semana4_gerenciador_de_armazem   \
  -DartifactId=semana4_gerenciador_de_armazem


## 2- Nesta aplicação construa a seguinte lógica:

Seu Roberto é um comerciante e que precisa de um sistema para gerenciar os produtos de seu armazém. 

Neste programa console, solicite a quantidade de produtos a cadastrar, depois cadastre estes produtos em um array list em memória. 

Dentro do mesmo programa faça um item de menu que liste os produtos cadastrados e o valor total da soma de todos os produtos
