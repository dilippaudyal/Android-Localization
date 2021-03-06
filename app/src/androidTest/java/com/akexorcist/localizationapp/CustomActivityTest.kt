package com.akexorcist.localizationapp


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.scrollTo
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.rule.ActivityTestRule
import androidx.test.uiautomator.UiDevice
import junit.framework.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class CustomActivityTest {
    @JvmField
    val uiDevices: UiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun customActivity() {
        val appCompatButton = onView(withId(R.id.btn_custom_activity))
        appCompatButton.perform(scrollTo(), click())

        val appCompatImageButton = onView(withId(R.id.btn_china))
        appCompatImageButton.perform(scrollTo(), click())

        Thread.sleep(200)

        val textView = onView(withId(R.id.textView))
        textView.check(matches(withText("打开 YouTube 应用时，您看到的是“精彩视频”页面。“精彩视频”显示您的订阅中近期上传的视频与活动，以及为您推荐的视频。如果您之前观看过音乐视频，那么还能看到一些热门内容以及 YouTube 合辑。您随时可以从导视面板导航回这个 Feed。")))

        uiDevices.setOrientationRight()

        Thread.sleep(200)

        textView.check(matches(withText("打开 YouTube 应用时，您看到的是“精彩视频”页面。“精彩视频”显示您的订阅中近期上传的视频与活动，以及为您推荐的视频。如果您之前观看过音乐视频，那么还能看到一些热门内容以及 YouTube 合辑。您随时可以从导视面板导航回这个 Feed。")))

        pressBack()

        Thread.sleep(200)

        val textView2 = onView(withId(R.id.textViewTitle))
        textView2.check(matches(withText("您好世界")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "您好世界")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "您好世界")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "您好世界")

        uiDevices.setOrientationNatural()

        Thread.sleep(200)

        textView2.check(matches(withText("您好世界")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "您好世界")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "您好世界")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "您好世界")

        val appCompatButton2 = onView(withId(R.id.btn_custom_activity))
        appCompatButton2.perform(scrollTo(), click())

        Thread.sleep(200)

        val textView101 = onView(withId(R.id.textView))
        textView101.check(matches(withText("打开 YouTube 应用时，您看到的是“精彩视频”页面。“精彩视频”显示您的订阅中近期上传的视频与活动，以及为您推荐的视频。如果您之前观看过音乐视频，那么还能看到一些热门内容以及 YouTube 合辑。您随时可以从导视面板导航回这个 Feed。")))

        val appCompatImageButton2 = onView(withId(R.id.btn_italy))
        appCompatImageButton2.perform(scrollTo(), click())

        Thread.sleep(200)

        val textView3 = onView(withId(R.id.textView))
        textView3.check(matches(withText("Quando apri l'app YouTube, viene visualizzata la sezione Che cosa guardare. In questa sezione vengono messi in evidenza i caricamenti recenti, le attività provenienti dalle tue iscrizioni e i video consigliati. Vengono anche visualizzati i contenuti popolari e i Mix di YouTube se hai già guardato video musicali in precedenza. Puoi tornare a questo feed in qualsiasi momento dalla Guida.")))

        uiDevices.setOrientationRight()

        Thread.sleep(200)

        textView3.check(matches(withText("Quando apri l'app YouTube, viene visualizzata la sezione Che cosa guardare. In questa sezione vengono messi in evidenza i caricamenti recenti, le attività provenienti dalle tue iscrizioni e i video consigliati. Vengono anche visualizzati i contenuti popolari e i Mix di YouTube se hai già guardato video musicali in precedenza. Puoi tornare a questo feed in qualsiasi momento dalla Guida.")))

        pressBack()

        Thread.sleep(200)

        val textView4 = onView(withId(R.id.textViewTitle))
        textView4.check(matches(withText("Ciao mondo")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "Ciao mondo")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "Ciao mondo")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "Ciao mondo")

        uiDevices.setOrientationNatural()

        Thread.sleep(200)

        textView4.check(matches(withText("Ciao mondo")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "Ciao mondo")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "Ciao mondo")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "Ciao mondo")

        val appCompatButton3 = onView(withId(R.id.btn_custom_activity))
        appCompatButton3.perform(scrollTo(), click())

        Thread.sleep(200)

        val textView301 = onView(withId(R.id.textView))
        textView301.check(matches(withText("Quando apri l'app YouTube, viene visualizzata la sezione Che cosa guardare. In questa sezione vengono messi in evidenza i caricamenti recenti, le attività provenienti dalle tue iscrizioni e i video consigliati. Vengono anche visualizzati i contenuti popolari e i Mix di YouTube se hai già guardato video musicali in precedenza. Puoi tornare a questo feed in qualsiasi momento dalla Guida.")))

        val appCompatImageButton3 = onView(withId(R.id.btn_japan))
        appCompatImageButton3.perform(scrollTo(), click())

        Thread.sleep(200)

        val textView5 = onView(withId(R.id.textView))
        textView5.check(matches(withText("YouTube アプリを開くと、[あなたへのおすすめ] ページが表示されます。[あなたへのおすすめ] では登録チャンネルの最新アップロードやアクティビティ、おすすめの動画が紹介されます。また、以前にミュージック ビデオを視聴した場合は人気のコンテンツや YouTube ミックスリストも表示されます。ガイドから、いつでもこのフィードに戻ることができます。")))

        uiDevices.setOrientationRight()

        Thread.sleep(200)

        textView5.check(matches(withText("YouTube アプリを開くと、[あなたへのおすすめ] ページが表示されます。[あなたへのおすすめ] では登録チャンネルの最新アップロードやアクティビティ、おすすめの動画が紹介されます。また、以前にミュージック ビデオを視聴した場合は人気のコンテンツや YouTube ミックスリストも表示されます。ガイドから、いつでもこのフィードに戻ることができます。")))

        pressBack()

        Thread.sleep(200)

        val textView6 = onView(withId(R.id.textViewTitle))
        textView6.check(matches(withText("こんにちは世界")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "こんにちは世界")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "こんにちは世界")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "こんにちは世界")

        uiDevices.setOrientationNatural()

        Thread.sleep(200)

        textView6.check(matches(withText("こんにちは世界")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "こんにちは世界")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "こんにちは世界")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "こんにちは世界")

        val appCompatButton4 = onView(withId(R.id.btn_custom_activity))
        appCompatButton4.perform(scrollTo(), click())

        Thread.sleep(200)

        val textView501 = onView(withId(R.id.textView))
        textView501.check(matches(withText("YouTube アプリを開くと、[あなたへのおすすめ] ページが表示されます。[あなたへのおすすめ] では登録チャンネルの最新アップロードやアクティビティ、おすすめの動画が紹介されます。また、以前にミュージック ビデオを視聴した場合は人気のコンテンツや YouTube ミックスリストも表示されます。ガイドから、いつでもこのフィードに戻ることができます。")))

        val appCompatImageButton4 = onView(withId(R.id.btn_korea))
        appCompatImageButton4.perform(scrollTo(), click())

        Thread.sleep(200)

        val textView7 = onView(withId(R.id.textView))
        textView7.check(matches(withText("YouTube 앱을 열면 볼만한 동영상 페이지가 표시됩니다. 볼만한 동영상에는 구독 채널의 최근 업로드 동영상과 활동 및 맞춤 동영상이 강조표시됩니다. 이전에 뮤직 비디오를 본 적이 있다면 인기 콘텐츠와 YouTube 믹스도 표시됩니다. 언제든 가이드에서 이 피드로 되돌아갈 수 있습니다.")))

        uiDevices.setOrientationRight()

        Thread.sleep(200)

        textView7.check(matches(withText("YouTube 앱을 열면 볼만한 동영상 페이지가 표시됩니다. 볼만한 동영상에는 구독 채널의 최근 업로드 동영상과 활동 및 맞춤 동영상이 강조표시됩니다. 이전에 뮤직 비디오를 본 적이 있다면 인기 콘텐츠와 YouTube 믹스도 표시됩니다. 언제든 가이드에서 이 피드로 되돌아갈 수 있습니다.")))

        pressBack()

        Thread.sleep(200)

        val textView8 = onView(withId(R.id.textViewTitle))
        textView8.check(matches(withText("안녕하세요세계")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "안녕하세요세계")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "안녕하세요세계")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "안녕하세요세계")

        uiDevices.setOrientationNatural()

        Thread.sleep(200)

        textView8.check(matches(withText("안녕하세요세계")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "안녕하세요세계")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "안녕하세요세계")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "안녕하세요세계")

        val appCompatButton5 = onView(withId(R.id.btn_custom_activity))
        appCompatButton5.perform(scrollTo(), click())

        val textView701 = onView(withId(R.id.textView))
        textView701.check(matches(withText("YouTube 앱을 열면 볼만한 동영상 페이지가 표시됩니다. 볼만한 동영상에는 구독 채널의 최근 업로드 동영상과 활동 및 맞춤 동영상이 강조표시됩니다. 이전에 뮤직 비디오를 본 적이 있다면 인기 콘텐츠와 YouTube 믹스도 표시됩니다. 언제든 가이드에서 이 피드로 되돌아갈 수 있습니다.")))

        val appCompatImageButton5 = onView(withId(R.id.btn_portugal))
        appCompatImageButton5.perform(scrollTo(), click())

        Thread.sleep(200)

        val textView9 = onView(withId(R.id.textView))
        textView9.check(matches(withText("Ao abrir a aplicação YouTube, é-lhe apresentada a página O que ver. A página O que ver destaca os carregamentos e as atividades mais recentes das suas subscrições e os vídeos recomendados para si. Verá ainda os conteúdos mais populares e também Mixes do YouTube, caso tenha acedido a vídeos de música anteriormente. Pode regressar a este feed em qualquer momento através do Guia.")))

        uiDevices.setOrientationRight()

        Thread.sleep(200)

        textView9.check(matches(withText("Ao abrir a aplicação YouTube, é-lhe apresentada a página O que ver. A página O que ver destaca os carregamentos e as atividades mais recentes das suas subscrições e os vídeos recomendados para si. Verá ainda os conteúdos mais populares e também Mixes do YouTube, caso tenha acedido a vídeos de música anteriormente. Pode regressar a este feed em qualquer momento através do Guia.")))

        pressBack()

        Thread.sleep(200)

        val textView10 = onView(withId(R.id.textViewTitle))
        textView10.check(matches(withText("Olá mundo")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "Olá mundo")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "Olá mundo")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "Olá mundo")

        uiDevices.setOrientationNatural()

        Thread.sleep(200)

        textView10.check(matches(withText("Olá mundo")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "Olá mundo")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "Olá mundo")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "Olá mundo")

        val appCompatButton6 = onView(withId(R.id.btn_custom_activity))
        appCompatButton6.perform(scrollTo(), click())

        Thread.sleep(200)

        val textView901 = onView(withId(R.id.textView))
        textView901.check(matches(withText("Ao abrir a aplicação YouTube, é-lhe apresentada a página O que ver. A página O que ver destaca os carregamentos e as atividades mais recentes das suas subscrições e os vídeos recomendados para si. Verá ainda os conteúdos mais populares e também Mixes do YouTube, caso tenha acedido a vídeos de música anteriormente. Pode regressar a este feed em qualquer momento através do Guia.")))

        val appCompatImageButton6 = onView(withId(R.id.btn_thai))
        appCompatImageButton6.perform(scrollTo(), click())

        Thread.sleep(200)

        val textView11 = onView(withId(R.id.textView))
        textView11.check(matches(withText("เมื่อคุณเปิดแอป YouTube คุณจะเข้ามาที่ ดูอะไรดี โดยส่วน ดูอะไรดี จะไฮไลต์การอัปโหลดและกิจกรรมล่าสุดจากช่องที่คุณติดตาม และวิดีโอที่แนะนำสำหรับคุณ นอกจากนี้ คุณยังจะเห็นเนื้อหาที่ได้รับความนิยมและ YouTube มิกซ์หากได้ดูมิวสิกวิดีโอไปก่อนหน้านี้ คุณสามารถกลับมาที่ฟีดนี้ได้ตลอดเวลาจากเมนู คำแนะนำ")))

        uiDevices.setOrientationRight()

        Thread.sleep(200)

        textView11.check(matches(withText("เมื่อคุณเปิดแอป YouTube คุณจะเข้ามาที่ ดูอะไรดี โดยส่วน ดูอะไรดี จะไฮไลต์การอัปโหลดและกิจกรรมล่าสุดจากช่องที่คุณติดตาม และวิดีโอที่แนะนำสำหรับคุณ นอกจากนี้ คุณยังจะเห็นเนื้อหาที่ได้รับความนิยมและ YouTube มิกซ์หากได้ดูมิวสิกวิดีโอไปก่อนหน้านี้ คุณสามารถกลับมาที่ฟีดนี้ได้ตลอดเวลาจากเมนู คำแนะนำ")))

        pressBack()

        Thread.sleep(200)

        val textView12 = onView(withId(R.id.textViewTitle))
        textView12.check(matches(withText("สวัสดีชาวโลก")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "สวัสดีชาวโลก")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "สวัสดีชาวโลก")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "สวัสดีชาวโลก")

        uiDevices.setOrientationNatural()

        Thread.sleep(200)

        textView12.check(matches(withText("สวัสดีชาวโลก")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "สวัสดีชาวโลก")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "สวัสดีชาวโลก")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "สวัสดีชาวโลก")

        val appCompatButton7 = onView(withId(R.id.btn_custom_activity))
        appCompatButton7.perform(scrollTo(), click())

        Thread.sleep(200)

        val textView1101 = onView(withId(R.id.textView))
        textView1101.check(matches(withText("เมื่อคุณเปิดแอป YouTube คุณจะเข้ามาที่ ดูอะไรดี โดยส่วน ดูอะไรดี จะไฮไลต์การอัปโหลดและกิจกรรมล่าสุดจากช่องที่คุณติดตาม และวิดีโอที่แนะนำสำหรับคุณ นอกจากนี้ คุณยังจะเห็นเนื้อหาที่ได้รับความนิยมและ YouTube มิกซ์หากได้ดูมิวสิกวิดีโอไปก่อนหน้านี้ คุณสามารถกลับมาที่ฟีดนี้ได้ตลอดเวลาจากเมนู คำแนะนำ")))

        val appCompatImageButton7 = onView(withId(R.id.btn_america))
        appCompatImageButton7.perform(scrollTo(), click())

        Thread.sleep(200)

        val textView13 = onView(withId(R.id.textView))
        textView13.check(matches(withText("When you open the YouTube app, you’ll land on What to Watch. What to Watch highlights recent uploads and activity from your subscriptions and videos recommended for you. You will also see popular content and YouTube Mixes if you’ve previously watched music videos. You can navigate back to this feed at any time from the Guide.")))

        uiDevices.setOrientationRight()

        Thread.sleep(200)

        textView13.check(matches(withText("When you open the YouTube app, you’ll land on What to Watch. What to Watch highlights recent uploads and activity from your subscriptions and videos recommended for you. You will also see popular content and YouTube Mixes if you’ve previously watched music videos. You can navigate back to this feed at any time from the Guide.")))

        pressBack()

        Thread.sleep(200)

        val textView14 = onView(withId(R.id.textViewTitle))
        textView14.check(matches(withText("Hello world")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "Hello world")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "Hello world")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "Hello world")

        uiDevices.setOrientationNatural()

        Thread.sleep(200)

        textView14.check(matches(withText("Hello world")))
        assertEquals(mActivityTestRule.activity.getString(R.string.hello_world), "Hello world")
        assertEquals(mActivityTestRule.activity.baseContext.getString(R.string.hello_world), "Hello world")
        assertEquals(mActivityTestRule.activity.applicationContext.getString(R.string.hello_world), "Hello world")
    }
}
