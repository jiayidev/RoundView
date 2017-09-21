package dev.brian.roundview;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RoundMenuView round_view;
    RoundMenuView.RoundMenu roundMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        round_view = (RoundMenuView) findViewById(R.id.round_view);

        roundMenu = new RoundMenuView.RoundMenu();
        /**
         * selectSolidColor:按下去的颜色
         * strokeColor:外圆外边的边线颜色
         */
        roundMenu.selectSolidColor = Color.parseColor("#548CFF");
        roundMenu.strokeColor = Color.parseColor("#F1F6F5");
        roundMenu.icon = BitmapFactory.decodeResource(getResources(), R.drawable.btn_big_right2);
        roundMenu.onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了1", Toast.LENGTH_SHORT).show();
            }
        };
        round_view.addRoundMenu(roundMenu);

        roundMenu = new RoundMenuView.RoundMenu();
        /**
         * selectSolidColor:按下去的颜色
         * strokeColor:外圆外边的边线颜色
         */
        roundMenu.selectSolidColor = Color.parseColor("#548CFF");
        roundMenu.strokeColor = Color.parseColor("#F1F6F5");
        roundMenu.icon = BitmapFactory.decodeResource(getResources(), R.drawable.btn_big_right2);
        roundMenu.onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了2", Toast.LENGTH_SHORT).show();
            }
        };
        round_view.addRoundMenu(roundMenu);

        roundMenu = new RoundMenuView.RoundMenu();
        /**
         * selectSolidColor:按下去的颜色
         * strokeColor:外圆外边的边线颜色
         */
        roundMenu.selectSolidColor = Color.parseColor("#548CFF");
        roundMenu.strokeColor = Color.parseColor("#F1F6F5");
        roundMenu.icon = BitmapFactory.decodeResource(getResources(), R.drawable.btn_big_right2);
        roundMenu.onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了3", Toast.LENGTH_SHORT).show();
            }
        };
        round_view.addRoundMenu(roundMenu);

        roundMenu = new RoundMenuView.RoundMenu();
        /**
         * selectSolidColor:按下去的颜色
         * strokeColor:外圆外边的边线颜色
         */
        roundMenu.selectSolidColor = Color.parseColor("#548CFF");
        roundMenu.strokeColor = Color.parseColor("#F1F6F5");
        roundMenu.icon = BitmapFactory.decodeResource(getResources(), R.drawable.btn_big_right2);
        roundMenu.onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了4", Toast.LENGTH_SHORT).show();
            }
        };
        round_view.addRoundMenu(roundMenu);
        /**
         * 第一个参数:内圆的颜色
         * 第二个参数:内圆按下去的颜色
         * 第三个参数:内圆外边的边线颜色
         */
        round_view.setCoreMenu(Color.parseColor("#8EC1FA"),
                Color.parseColor("#548CFF"), Color.parseColor("#F1F6F5")
                , 10, 0.30, BitmapFactory.decodeResource(getResources(), R.drawable.btn_big_stop), new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "点击了中间", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
