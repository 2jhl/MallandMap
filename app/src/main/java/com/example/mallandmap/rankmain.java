package com.example.mallandmap;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ListView;

public class rankmain extends Activity {

    private customAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new customAdapter();
        listView = (ListView) findViewById(R.id.listView);

        setData();

        listView.setAdapter(adapter);
    }

    // 보통 ListView는 통신을 통해 가져온 데이터를 보여줍니다.
    // arrResId, titles, contents를 서버에서 가져온 데이터라고 생각하시면 됩니다.
    private void setData() {
        TypedArray arrResId = getResources().obtainTypedArray(R.array.resId);
        String[] titles = getResources().getStringArray(R.array.title);
        String[] contents = getResources().getStringArray(R.array.content);

        for (int i = 0; i < arrResId.length(); i++) {
            customrank ran = new customrank();
            ran.setResId(arrResId.getResourceId(i, 0));
            ran.setTitle(titles[i]);
            ran.setContent(contents[i]);

            adapter.addItem(ran);
        }
    }
}
