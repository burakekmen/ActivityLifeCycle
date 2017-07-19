package com.androidedu.kodluyoruzakademi.activitylifecycle;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = "KodluyoruzOdev";
    ImageView imgView;
    TextView txtYanSayfa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //  2(DIK)  ||  7(YAN)
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nesneleriTanimla();
        Log.e(TAG, "onCreate");
    }

    @Override
    public void onContentChanged() {  //  1(DIK)  ||  6(YAN)
        super.onContentChanged();
        Log.e(TAG, "onContentChanged");
    }

    @Override
    protected void onStart() {  //  3(DIK)  ||  8(YAN)
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {  //  (DIK)  ||  9(YAN)
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "onRestoreInstanceState");

        // Bu metodu görmek için ekranı yan çevirmek yeterli olacaktır. DİK Ekranda bu metoda girilmez.
        // InstanceState i günceller.
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {  //  4(DIK)  ||  10(YAN)
        super.onPostCreate(savedInstanceState);
        Log.e(TAG, "onPostCreate");
    }

    @Override
    protected void onResume() {  //  5(DIK)  ||  11(YAN)
        super.onResume();
        Log.e(TAG, "onResume");
    }

    @Override
    protected void onPostResume() {  //  6(DIK)  ||  12(YAN)
        super.onPostResume();
        Log.e(TAG, "onPostResume");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {  //  8(DIK)  ||  14(YAN)
        Log.e(TAG, "onCreateOptionsMenu");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {  //  9(DIK)  ||  15(YAN)
        Log.e(TAG, "onPrepareOptionsMenu");
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    protected void onPause() { //  (DIK)  ||  2(YAN)
        super.onPause();
        Log.e(TAG, "onPause");

        // İlk açılışta metoda girmez!
        // Activity geçişlerinde bu metoda girer.
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {  //  (DIK)  ||  3(YAN)
        super.onSaveInstanceState(outState);
        Log.e(TAG, "onSaveInstanceState");

        // Başka bir ekrana geçiş yaparken görülür.
        // Ekranımızın bilgilerini gradle içine kaydeder.
    }

    @Override
    protected void onStop() {  //  (DIK)  ||  4(YAN)
        super.onStop();
        Log.e(TAG, "onStop");

        // İlk açılışta bu metoda girmez.
        // Activity geçişlerinde önceki activity durdurulur. O zaman bu metoda girilir.
    }

    @Override
    protected void onDestroy() {  //  (DIK)  ||  5(YAN)
        super.onDestroy();
        Log.e(TAG, "onDestroy");

        // İlk açılışta bu metoda girilmez.
        // Bu metodu görebilmek için uygulamadan çıkmak gerekir.
    }

    @Override
    public void onUserInteraction() {  //  (DIK)  ||  (YAN)
        super.onUserInteraction();
        Log.e(TAG, "onUserInteraction");

        // Bu metodu görmek için ekranla etkileşim içine girmek gerekir.
        // Kullanıcının tüm hareketleri bu metoda düşer. Ne yaparsa yapsın bu metotda tetiklenir.
    }

    @Override
    protected void onUserLeaveHint() {  //  (DIK)  ||  (YAN)
        super.onUserLeaveHint();
        Log.e(TAG, "onUserLeaveHint");

        // Bu metodu onUserInteraction() tetikler.
        // Örneğin bir TEXTVIEW e bastığımızda parmağımızı kaldırdığımızda önce onUserInteraction() metodu daha sonra da onUserLeaveHint() metodu tetiklenir.
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {  //  (DIK)  ||  (YAN)
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(TAG, "onActivityResult");

        // Eğer kullanıcıya yaptıracağımız bir iş varsa, o iş bittiğinde onActivityResult tetiklenir.
        // Örneğin kullanıcıya Rehberinden kayıt seçmesi istendiğinde olabilir.
    }

    @Override
    protected void onRestart() {  //  (DIK)  ||  (YAN)
        super.onRestart();
        Log.e(TAG, "onRestart");

        // Bu metodu görebilmek için başka activitye geçip oradan da eski activitye geçmek gerekir.
        // Eski activityi durdurduğu için tekrar açmak istediğinizde onRestart() çalışacaktır.
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {  //  (DIK)  ||  1(YAN)
        super.onConfigurationChanged(newConfig);
        Log.e(TAG, "onConfigurationChanged");

        // Konfigürasyon ayarlarını değiştirdiğimzde bu metoda düşer.
        // Örneğin telefonu yan çevirmek, ekran boyutu değişimi vb. diyebiliriz.
    }

    @Override
    public void onBackPressed() {  //  (DIK)  ||  (YAN)
        super.onBackPressed();
        Log.e(TAG, "onBackPressed");

        // Bu metodu görebilmek için ekranda BACK tuşuna basmak gereklidir.
        // Her geri tuşuna basıldığında bu metot tetiklenir.
    }

    @Override
    public void onAttachedToWindow() {  //  7(DIK)  ||  13(YAN)
        super.onAttachedToWindow();
        Log.e(TAG, "onAttachedToWindow");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {  //  (DIK)  ||  (YAN)
        super.onAttachFragment(fragment);
        Log.e(TAG, "onAttachFragment");

        // Bu metodu görebilmemiz için fragment kullanmamız gerekirdi.
        // Bir fragment bu fragmentın çocuğu olarak eklendiğinde çağrılır.
    }


    private void nesneleriTanimla() {
        imgView = (ImageView) findViewById(R.id.imgView);
        txtYanSayfa = (TextView) findViewById(R.id.txtYanSayfa);

        imgView.setOnClickListener(this);
        txtYanSayfa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imgView:
                Toast.makeText(this, "Burak EKMEN'den Selamlar (:", Toast.LENGTH_LONG).show();
                break;
            case R.id.txtYanSayfa:
                startActivity(new Intent(MainActivity.this, YanActivity.class));
                break;
            default:
                break;
        }
    }
}
