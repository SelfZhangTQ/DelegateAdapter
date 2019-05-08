package com.adapter.adapter;

import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;

public class ItemData extends ArrayList<Object> {


  public ItemData() {
    super();
  }


  public ItemData(int initialCapacity) {
    super(initialCapacity);
  }


  public ItemData(@NonNull Collection<?> c) {
    super(c);
  }
}
