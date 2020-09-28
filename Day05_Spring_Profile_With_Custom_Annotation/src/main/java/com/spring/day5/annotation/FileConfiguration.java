package com.spring.day5.annotation;

import org.springframework.context.annotation.Profile;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
  Annotation တစ္ခုတည္ေဆာက္မယ္ဆိုရင္ @Interface ကို အသုံးျပဳၿပီး တည္ေဆာက္ရပါတယ္။
  သူ႕ရဲ႕ Method မွာ Parameter ထည့္လို႕ မရဘူး၊ Exception throw လုပ္လို႕မရဘူး၊

  ထို႕အျပင္ Custom annotation တစ္ခု တည္ေဆာက္မယ္ဆိုရင္ metadata လိုတယ္ -
  ၁. @Retention(RetentionPolicy) -> တည္ေဆာက္လိုက္တဲ႕ Annotation ကို ဘယ္အခ်ိန္မွာ သုံးမလဲ သတ္မွတ္ေပး၊
  ၂. @Target(ElementType) -> ဒီ Annotation ကို ဘယ္ေနရာမွာ သုံးမလဲ သတ္မွတ္ေပးရပါမယ္။

  * RetentionPolicy သုံးမ်ဳိးရွိပါတယ္။
  - SOURCE   -> SOURCE ဆိုတာက ေတာ့ Source level သာအသုံးျပဴၿပီး CompileTime မွာေရာ RunTime မွာေရာ အလုပ္လုပ္မွာ မဟုတ္ပါဘူး။
  - CLASS    -> CLASS ဆိုတာက ေတာ့ CompileTime မွာ ေတာ့ အလုပ္လုပ္ၿပီး RunTime မွာေတာ့ အလုပ္လုပ္မွာ မဟုတ္ပါဘူး။
  - RUNTIME  -> RUNTIME ဆိုတာက ေတာ့ Runtime မွာ သုံးဖို႔ ျဖစ္ပါတယ္။

 */

@Retention(RetentionPolicy.RUNTIME)
@Profile("file")
public @interface FileConfiguration {
}
