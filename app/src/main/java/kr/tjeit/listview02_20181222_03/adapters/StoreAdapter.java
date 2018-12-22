package kr.tjeit.listview02_20181222_03.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

import java.util.List;

import kr.tjeit.listview02_20181222_03.R;
import kr.tjeit.listview02_20181222_03.datas.Store;

public class StoreAdapter extends ArrayAdapter<Store> {
    Context mContext;  // 어느 화면이 이 어뎁터를 사용하는 지 저장
    List<Store> mList; // 실제 화면에 뿌릴 근거 데이터를 담는 list
    LayoutInflater inf; // R.layout.그린파일 ==> 실제로 메모리에 그려주는 역할
    public StoreAdapter(Context mContext, List<Store> mList){
        super(mContext, R.layout.store_list_item, mList);

        this.mContext = mContext;
        this.mList = mList;
        this.inf = LayoutInflater.from(mContext);
    }
}
