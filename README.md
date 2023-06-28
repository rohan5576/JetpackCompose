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


