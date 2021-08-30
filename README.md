# PicPay - Desafio Android

[Enunciado Original](https://github.com/mobilepicpay/desafio-android/blob/master/README.md)

## Mudanças

### Arquitetura e configurações
- Update do target sdk, gradle e todas as dependências;
- Utilização de temas e estilos seguindo os [novos padrões recomendados](https://developer.android.com/guide/topics/ui/look-and-feel/themes?hl=pt-br#versus);
- Adição de traduções: inglês / português;
- Utilização do modelo single activity com o jetpack navigation ([single activity](https://oozou.com/blog/reasons-to-use-android-single-activity-architecture-with-navigation-component-36));
- Utilização da arquitetura MVVM com databinding;
- Chamada ao servidor usando corrotinas;
- Mudança do gson para moshi: optei por fazer essa alteração devido às [vantagens que o moshi apresenta em relação ao gson](https://proandroiddev.com/goodbye-gson-hello-moshi-4e591116231e).
- [Em comparação com outras libs](https://proandroiddev.com/coil-vs-picasso-vs-glide-get-ready-go-774add8cfd40) picasso apresenta um menor desempenho, mesmo que pequeno, por esse motivo optei pelo coil e também porque estou mais acostumado com ele xD
- Injeção de dependências com hilt para injetar o repositório no view model que conecta com o servidor;

### UX / UI

#### Ícone do app

<div align="center">
<img height="480" src="https://user-images.githubusercontent.com/49538805/131348055-d09858a2-d3b4-4701-b95e-c6b070f25b53.jpg">
</div>

#### Dark theme e light theme

**OBS:** O último tema escolhido pelo usuário é mantido no shared preferences (por default é dark):

https://user-images.githubusercontent.com/49538805/131348583-b84c14a7-4dca-4da9-8a5b-8938e74f1d9f.mp4

#### Efeito shimmer

https://user-images.githubusercontent.com/49538805/131349471-632f830d-caed-4552-ae48-07a26115e123.mp4

#### Botão de reconexão com o servidor em caso de erro:

https://user-images.githubusercontent.com/49538805/131350304-880fad88-e2b0-4c77-8d4f-7cd7516ba330.mp4

#### Tela das minhas redes sociais (segue lá xD):

https://user-images.githubusercontent.com/49538805/131351173-f577da74-31a8-4a99-9462-3545abdf5084.mp4


## Testes

Confesso que ainda estou muito raso em relação a testes mas fiz alguns:

- Testes unitários para testar view model com live data: `ThemeTest.kt`
- Testes unitários para testar ordem e conteúdo dos itens das redes sociais: `SocialMediaTest.kt`
