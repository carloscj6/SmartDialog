# SmartDialog  
[ ![Download](https://api.bintray.com/packages/carloscj6/UI/SmartDialog/images/download.svg) ](https://bintray.com/carloscj6/UI/SmartDialog/_latestVersion)  [![Codacy Badge](https://api.codacy.com/project/badge/Grade/12a63c07db7a4b03a2ad7858e5b2c76b)](https://app.codacy.com/app/carloscj6/SmartDialog?utm_source=github.com&utm_medium=referral&utm_content=carloscj6/SmartDialog&utm_campaign=Badge_Grade_Dashboard)  
  
Simple Progress dialog built for simplicity and beauty.  
## Usage  
```gradle   
   implementation 'com.revosleap.smartdialog:dialog:1.0.0'  
 ```
 ## Example  
> Kotlin  
```kotlin  
val dialog = SmartDialog(this@MainActivity)  
```  
  
## Methods provided  

|    METHOD                   |ROLE                           |
|-----------------------------|-------------------------------|
|`onPositiveButtonClicked(onClickListener: View.OnClickListener?)`|Attach clicklistener to positive button.            |
|`onPositiveNegativeClicked(onClic  kListener: View.OnClickListener?)`|Attach clicklistener to negative button.            |
|`onPositiveNeutralClicked(onClickListener: View.OnClickListener?)`|Attach clicklistener to neutral button.|
|`bodyTypeface(typeface: Typeface)`| Set a custom font for the display text.|
|`hideProgress(info: String)`|Hide progressbar.|
|`showProgress(title: String, cancelable: Boolean)`|Show the progressbar.|
|`changeProgress(title: String, cancelable: Boolean)`|Change the title and cancelable state of the progressbar.|

  
## License  
This is a free amd open source library Licensed under [Apache License 2.0](/LICENSE).

