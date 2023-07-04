# JetpackCompose

 Jetpack Compose is a modern toolkit for building native Android UI. Jetpack Compose uses fewer lines of code, strong tools, and clear Kotlin APIs to streamline and speed up UI development on Android. 

 Jetpack Compose is totally declarative programming, which means you can describe your user interface by invoking a set of composable

<b>Imperative programming vs Declarative programming</b>

<b>Imperative programming</b>
This design focuses on the how rather than the what. A good example is XML layouts in Android. We design the widgets and components which are then rendered for the user to see and interact with.

<b>Declarative programming</b>
This pattern is an emerging trend that allows developers to design the user interface based on the data received. This on the other hand focuses on the what. This design paradigm makes use of one programming language to create an entire application.

<b>Advantages of JetPack Compose</b>
1. It is very fast and offers a smooth performance.
2. It’s simple to learn.
3. It is possible to interoperate with an imperative approach.
4. Offers a better way to implement loose coupling principles.
5. It is 100% made in Kotlin which makes it a modern approach in Android development

<b>Composable Function</b>
In Jetpack Compose, Composable functions are used to define all the UI of your app programmatically. So, you need not use any XML files for the layout of the app. All you need to make a composable function is just by using the @Composable annotation to the function name. The basic syntax of a Composable function is:
```
 @Composable
    fun sampleText(text:String){
        // Text is used to print the text.
        Text(text)
    }
```
 

<b>how to Jetpack compose in existing XML Layout</b>

If you want to use a Compose in your XML file, you can add this to your layout file:

```
<androidx.compose.ui.platform.ComposeView
  android:id="@+id/my_composable"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content" />
```
```
findViewById<ComposeView>(R.id.my_composable).setContent {
  MaterialTheme {
    Surface {
      Text(text = "Hello!")
    }
  }
}
```
If you want the opposite, i.e. to use an XML file in your compose, you can use this:

```
AndroidView(
  factory = { context ->
    val view = LayoutInflater.from(context).inflate(R.layout.my_layout, null, false)
    val textView = view.findViewById<TextView>(R.id.text)

    // do whatever you want...
    view // return the view
  },
  update = { view ->
    // Update the view
  }
)
```
<b>Preview</b>

You need to add @Preview() annotation before the composable function. After adding this annotation we are able to see the preview of our UI.\
we can customise the preview annotation by using below features:-

Name,Background,Height and Width ,SystemUI and Device,Multiple Previews.


<b> Text Resources </b>

![image](https://github.com/rohan5576/JetpackCompose/assets/22514415/f708617a-a068-44ab-b58c-968528e3194f)

<b> Image Resources </b>

![image](https://github.com/rohan5576/JetpackCompose/assets/22514415/10788784-87ce-4d30-90c1-89d92c7e9f93)

<b> Button Resources</b>

![image](https://github.com/rohan5576/JetpackCompose/assets/22514415/205d9532-0491-44f9-9628-6f736d5ad515)

<b> Text Field </b>
 TextField is a user interface control that is used to allow the user to enter the text. This widget is used to get the data from the user as numbers or text. 
 
![image](https://github.com/rohan5576/JetpackCompose/assets/22514415/8f6160d8-c01a-4172-8f73-9f6dfe6ef6c7)

<b>mutable state</b> -  It returns an observable value for Compose. If the value changes UI gets changed automatically. 
<b>TextFieldValue</b> - A class holding information about the editing state. 

<b>In TextField() function, we use two arguments, value & onValueChange</b>

 value - We need to set the TextFieldValue. We created a variable (text) for this. And we assigned text to this argument.

 onValueChange - It will return a new value (TextFieldValue)  when the user enters the text. 

 ![image](https://github.com/rohan5576/JetpackCompose/assets/22514415/45549b74-3a36-4819-9302-e7a283a5a2b4)


 <b> Row and columns </b>
 It provides an invisible container to hold the views or layouts. We can place a group of views/layouts inside the layouts. Row and column are layouts to arrange our views in a Linear manner. 

 Row - It arranges the views horizontally.
 
 Column - It arranges the views vertically. 

 ![image](https://github.com/rohan5576/JetpackCompose/assets/22514415/a035fa1d-226a-4490-9a63-a17704fc8caa)

 ![image](https://github.com/rohan5576/JetpackCompose/assets/22514415/be6b80a2-8c86-4e84-81ec-1e7d22db719b)

Example :

![image](https://github.com/rohan5576/JetpackCompose/assets/22514415/cf9db24a-37ab-4218-9d1a-2f2b35602dab)

![image](https://github.com/rohan5576/JetpackCompose/assets/22514415/ad9fe55a-2ee8-46f3-bab7-51579a669e30)


<b>Modifier</b>
Modifier elements decorate or add behavior to Compose UI elements. 

![image](https://github.com/rohan5576/JetpackCompose/assets/22514415/bee4980d-e7ae-4562-a04e-43e28fe09b6b)

![image](https://github.com/rohan5576/JetpackCompose/assets/22514415/705da648-c9f2-42c9-a4d8-0ce6d89bbce7)



<b>List In Compose</b>

![image](https://github.com/rohan5576/JetpackCompose/assets/22514415/c53ea2b1-f14c-4878-b39a-d1f6b2aac16a)

