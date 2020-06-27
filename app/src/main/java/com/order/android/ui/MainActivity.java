package com.order.android.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.order.android.R;
import com.order.android.adapter.DishesAdapter;
import com.order.android.base.BaseActivity;
import com.order.android.bean.DishesDetails;

public class MainActivity extends BaseActivity {

    public static void startActivity(Context mContext){
        Intent intent=new Intent(mContext,MainActivity.class);
        mContext.startActivity(intent);
    }

    RecyclerView recyclerView=null;
    DishesAdapter dishesAdapter=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        initView();
    }

    private void initView(){
        recyclerView=(RecyclerView)findViewById(R.id.dishes_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dishesAdapter = new DishesAdapter();

        recyclerView.setAdapter(dishesAdapter);
        View headView = getLayoutInflater().inflate(R.layout.item_header, null);
        dishesAdapter.addHeaderView(headView);
        dishesAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

            }
        });

        dishesAdapter.setNewData(DishesDetails.getDishesDetailsList());
    }
}