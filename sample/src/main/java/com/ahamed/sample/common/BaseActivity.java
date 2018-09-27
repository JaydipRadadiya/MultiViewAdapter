/*
 * Copyright 2017 Riyaz Ahamed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ahamed.sample.common;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.ahamed.sample.R;

public abstract class BaseActivity extends AppCompatActivity {

  protected RecyclerView recyclerView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    // uncomment while testing performance
    //TinyDancer.create()
    //    .redFlagPercentage(.1f)
    //    .startingGravity(Gravity.TOP)
    //    .startingXPosition(200)
    //    .startingYPosition(600)
    //    .show(this);

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sample);

    recyclerView = (RecyclerView) findViewById(R.id.rcv_list);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    if (null != getSupportActionBar()) {
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    setUpAdapter();
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    if (item.getItemId() == android.R.id.home) {
      finish();
      return true;
    }
    return super.onOptionsItemSelected(item);
  }

  protected abstract void setUpAdapter();
}
