# ProfileNew
<pre style="direction: rtl;" dir="rtl">
این پروژه یک تمرین آموزشی برای آشنایی با ویو گروپ های می باشد

ویژگی های این تمرین 

1. دارای تصویر پروفایل  
2. نام کاربر 
3. ویرایش نام به کمک intent
4. رفتن به ادرسی در اینترنت به کمک intent 
5. مهارت های کاربر 
6. شهر محل زندگی کاربر 

</pre>

<div style="margin:0 auto;padding:15px;display:inline-block" dir="rtl">
 <img src="https://github.com/MehrdadTabesh/ProfileNew/raw/master/profile.png" alt="drawing" width="400px" height="800px" style="max-width:100%;float: right;">
 
 <img src="https://github.com/MehrdadTabesh/ProfileNew/blob/master/edit.png" style="float:right" alt="drawing" width="400px" height="800px" margin="10px"/>
</div>
<pre dir="rtl">
نکته ای  مفید  این پروژه شاید استفاده از  دو نوع intent باشد
1.صریح Explicit Intents
<code dir="ltr">

</code>
2. ضمنیImplicit Intents
<code dir="ltr">
 
  viewWebSiteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("7learn.com"));
                startActivity(intent);
            }
        });
</code>
</pre>
