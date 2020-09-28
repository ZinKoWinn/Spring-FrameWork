package com.spring.day5.annotation;

import org.springframework.context.annotation.Profile;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
  Annotation တစ်ခုတည်ဆောက်မယ်ဆိုရင် @Interface ကို အသုံးပြုပြီး တည်ဆောက်ရပါတယ်။
  သူ့ရဲ့ Method မှာ Parameter ထည့်လို့ မရဘူး၊ Exception throw လုပ်လို့မရဘူး၊

  ထို့အပြင် Custom annotation တစ်ခု တည်ဆောက်မယ်ဆိုရင် metadata လိုတယ် -
  ၁. @Retention(RetentionPolicy) -> တည်ဆောက်လိုက်တဲ့ Annotation ကို ဘယ်အချိန်မှာ သုံးမလဲ သတ်မှတ်ပေး၊
  ၂. @Target(ElementType) -> ဒီ Annotation ကို ဘယ်နေရာမှာ သုံးမလဲ သတ်မှတ်ပေးရပါမယ်။

  * RetentionPolicy သုံးမျိုးရှိပါတယ်။
  - SOURCE   -> SOURCE ဆိုတာက တော့ Source level သာအသုံးပြူပြီး CompileTime မှာရော RunTime မှာရော အလုပ်လုပ်မှာ မဟုတ်ပါဘူး။
  - CLASS    -> CLASS ဆိုတာက တော့ CompileTime မှာ တော့ အလုပ်လုပ်ပြီး RunTime မှာတော့ အလုပ်လုပ်မှာ မဟုတ်ပါဘူး။
  - RUNTIME  -> RUNTIME ဆိုတာက တော့ Runtime မှာ သုံးဖို့ ဖြစ်ပါတယ်။

 */
@Retention(RetentionPolicy.RUNTIME)
@Profile("database")
public @interface DatabaseConfiguration {
}
