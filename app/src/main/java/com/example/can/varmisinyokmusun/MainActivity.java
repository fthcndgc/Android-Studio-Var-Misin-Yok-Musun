package com.example.can.varmisinyokmusun;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, kendikutunuz;
    ListView paralistesi;
    int sayac = 0;
    final ArrayList<String> karisikpara = new ArrayList<>();
    final ArrayList<String> paralar = new ArrayList<>();
    final ArrayList<String> paralar2 = new ArrayList<>();
    int kazanc;
    MediaPlayer alkis, kaybetme, telefon;
    int acilanpara = 0;
    String teklif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b14 = (Button) findViewById(R.id.button14);
        b15 = (Button) findViewById(R.id.button15);
        b16 = (Button) findViewById(R.id.button16);
        b17 = (Button) findViewById(R.id.button17);
        b18 = (Button) findViewById(R.id.button18);
        b19 = (Button) findViewById(R.id.button19);
        b20 = (Button) findViewById(R.id.button20);
        kendikutunuz = (Button) findViewById(R.id.kendikutunuz);
        paralistesi = (ListView) findViewById(R.id.listView);
        alkis = MediaPlayer.create(MainActivity.this, R.raw.alkis);
        kaybetme = MediaPlayer.create(MainActivity.this, R.raw.kaybetme);
        telefon = MediaPlayer.create(this,R.raw.telefoncal);
        paralar.add("1");
        paralar.add("2");
        paralar.add("5");
        paralar.add("10");
        paralar.add("25");
        paralar.add("50");
        paralar.add("100");
        paralar.add("200");
        paralar.add("300");
        paralar.add("400");
        paralar.add("500");
        paralar.add("750");
        paralar.add("10000");
        paralar.add("20000");
        paralar.add("30000");
        paralar.add("40000");
        paralar.add("50000");
        paralar.add("100000");
        paralar.add("150000");
        paralar.add("200000");
        paralar.add("250000");
        paralar.add("500000");
        paralar.add("500000");
        paralar.add("500000");

        for (int i = 0; i < 24; i++)
            paralar2.add(paralar.get(i));

        for (int i = 0; i < 24; i++) {
            Random veri = new Random();
            int boyut = paralar.size();
            int rastgele = veri.nextInt(boyut);
            karisikpara.add(String.valueOf(paralar.get(rastgele)));
            paralar.remove(rastgele);
        }
        listele(paralar2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b1.getText());
                    b1.setVisibility(View.INVISIBLE);
                } else {
                    b1.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(0));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(0), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(0)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(0));
                }
                sayac++;
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b2.getText());
                    b2.setVisibility(View.INVISIBLE);
                } else {
                    b2.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(1));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(1), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(1)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(1));
                }
                sayac++;
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b3.getText());
                    b3.setVisibility(View.INVISIBLE);
                } else {
                    b3.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(2));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(2), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(2)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(2));
                }
                sayac++;
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b4.getText());
                    b4.setVisibility(View.INVISIBLE);
                } else {
                    b4.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(3));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(3), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(3)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(3));
                }
                sayac++;
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b5.getText());
                    b5.setVisibility(View.INVISIBLE);
                } else {
                    b5.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(4));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(4), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(4)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(4));
                }
                sayac++;
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b6.getText());
                    b6.setVisibility(View.INVISIBLE);
                } else {
                    b6.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(5));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(5), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(5)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(5));
                }
                sayac++;
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b7.getText());
                    b7.setVisibility(View.INVISIBLE);
                } else {
                    b7.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(6));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(6), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(6)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(6));
                }
                sayac++;
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b8.getText());
                    b8.setVisibility(View.INVISIBLE);
                } else {
                    b8.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(7));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(7), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(7)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(7));
                }
                sayac++;
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b9.getText());
                    b9.setVisibility(View.INVISIBLE);
                } else {
                    b9.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(8));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(8), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(8)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(8));
                }
                sayac++;
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b10.getText());
                    b10.setVisibility(View.INVISIBLE);
                } else {
                    b10.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(9));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(9), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(9)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(9));
                }
                sayac++;
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b11.getText());
                    b11.setVisibility(View.INVISIBLE);
                } else {
                    b11.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(10));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(10), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(10)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(10));
                }
                sayac++;
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b12.getText());
                    b12.setVisibility(View.INVISIBLE);
                } else {
                    b12.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(11));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(11), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(11)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(11));
                }
                sayac++;
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b13.getText());
                    b13.setVisibility(View.INVISIBLE);
                } else {
                    b13.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(12));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(12), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(12)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(12));
                }
                sayac++;
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b14.getText());
                    b14.setVisibility(View.INVISIBLE);
                } else {
                    b14.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(13));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(13), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(13)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(13));
                }
                sayac++;
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b15.getText());
                    b15.setVisibility(View.INVISIBLE);
                } else {
                    b15.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(14));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(14), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(14)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(14));
                }
                sayac++;
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b16.getText());
                    b16.setVisibility(View.INVISIBLE);
                } else {
                    b16.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(15));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(15), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(15)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(15));
                }
                sayac++;
            }
        });
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b17.getText());
                    b17.setVisibility(View.INVISIBLE);
                } else {
                    b17.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(16));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(16), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(16)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(16));
                }
                sayac++;
            }
        });
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b18.getText());
                    b18.setVisibility(View.INVISIBLE);
                } else {
                    b18.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(17));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(17), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(17)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(17));
                }
                sayac++;
            }
        });
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b19.getText());
                    b19.setVisibility(View.INVISIBLE);
                } else {
                    b19.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(18));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(18), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(18)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(18));
                }
                sayac++;
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sayac == 0) {
                    kendikutunuz.setVisibility(View.VISIBLE);
                    kendikutunuz.setText(b20.getText());
                    b20.setVisibility(View.INVISIBLE);
                } else {
                    b20.setVisibility(View.INVISIBLE);
                    int index = paralar2.indexOf(karisikpara.get(19));
                    paralar2.remove(index);
                    Toast.makeText(getApplicationContext(), karisikpara.get(19), Toast.LENGTH_SHORT).show();
                    listele(paralar2);
                    if (paralar2.size() == 1) {
                        kazanc = Integer.parseInt(paralar2.get(0));
                        Toast.makeText(getApplicationContext(), "Kazancınız : " + String.valueOf(paralar2.get(0)), Toast.LENGTH_SHORT).show();
                    }
                    if (sayac > 5)
                        hamdineyteklifi(acilanpara);
                    if (Integer.parseInt(karisikpara.get(19)) <= 50000)
                        alkis.start();
                    else
                        kaybetme.start();
                    acilanpara = acilanpara + Integer.parseInt(karisikpara.get(19));
                }
                sayac++;
            }
        });
    }

    public void listele(ArrayList<String> para) {
        //ArrayAdapter<String> veriAdaptoru = new ArrayAdapter<String>
        //(this, android.R.layout.simple_list_item_1, android.R.id.text1, para);

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, para) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                ViewGroup.LayoutParams params = view.getLayoutParams();
                params.height = 50;
                view.setLayoutParams(params);
                return view;
            }
        };


        paralistesi.setAdapter(arrayAdapter);
    }

    public void kendikutunuzuacin() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Var mısın? Yok musun?");
        builder.setMessage("Kutunuzu açmak ister misiniz?");
        builder.setNegativeButton("İPTAL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });
        builder.setPositiveButton("TAMAM", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                if (kendikutunuz.getText() != "") {
                    int kendikutunuzid = Integer.parseInt((String) kendikutunuz.getText());
                    kazanc = Integer.parseInt(karisikpara.get(kendikutunuzid - 1));
                    //Toast.makeText(getApplicationContext(), "Kazancınız : " + karisikpara.get(kendikutunuzid-1), Toast.LENGTH_SHORT).show();
                    applicationRestart();
                }
            }
        });


        builder.show();
    }

    public void hamdineyteklifi(int acilanpara) {
        int teklifint = 0;

        if (acilanpara > 2000000 && acilanpara <= 2352343) {
            Random veri = new Random();
            teklifint = veri.nextInt(5000); // 0 - 5.000
        }
        if (acilanpara > 1000000 && acilanpara <= 2000000) {
            Random veri = new Random();
            teklifint = veri.nextInt(5000)+5000; // 5.000 - 10.000
        }
        if (acilanpara > 500000 && acilanpara <= 1000000) {
            Random veri = new Random();
            teklifint = veri.nextInt(15000)+10000; // 10.000 - 25.000
        }
        if (acilanpara > 400000 && acilanpara <= 500000) {
            Random veri = new Random();
            teklifint = veri.nextInt(25000)+25000; // 25.000 - 50.000
        }
        if (acilanpara > 300000 && acilanpara <= 400000) {
            Random veri = new Random();
            teklifint = veri.nextInt(50000)+50000; // 50.000 - 100.000
        }
        if (acilanpara > 150000 && acilanpara <= 300000) {
            Random veri = new Random();
            teklifint = veri.nextInt(100000)+100000; // 100.000 - 200.000
        }
        if (acilanpara > 100000 && acilanpara <= 150000) {
            Random veri = new Random();
            teklifint = veri.nextInt(100000) + 200000; // 200.000-300.000
        }
        if (acilanpara > 50000 && acilanpara <= 100000) {
            Random veri = new Random();
            teklifint = veri.nextInt(100000) + 300000; //300.000 - 400.000
        }
        if (acilanpara > 0 && acilanpara <= 50000) {
            Random veri = new Random();
            teklifint = veri.nextInt(100000) + 400000; // 400.000 - 500.000
        }

        teklif = String.valueOf(teklifint);

        telefon.start();

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Var mısın? Yok musun?");
        builder.setMessage("Hamdi Bey' in teklifi = " + teklif + " Kabul ediyor musunuz?");
        builder.setNegativeButton("İPTAL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                telefon.stop();
                kendikutunuzuacin();
            }
        });
        builder.setPositiveButton("TAMAM", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                telefon.stop();
                kazanc = Integer.parseInt(teklif);
                applicationRestart();
            }
        });


        builder.show();
    }

    public void applicationRestart() {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Var mısın? Yok musun?");
        builder.setMessage("Kazancınız : " + kazanc + "tl. Yeniden oynamak ister misiniz?");
        builder.setNegativeButton("İPTAL", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
                System.exit(0);
            }
        });
        builder.setPositiveButton("TAMAM", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                if (kendikutunuz.getText() != "") {
                    Intent intent = getIntent();
                    MainActivity.this.finish();
                    startActivity(intent);
                }
            }
        });
        builder.show();
    }
}
