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

package gradle;

public class Config {

  public static final int MIN_SDK = 14;
  public static final int COMPILE_SDK = 28;
  public static final int TARGET_SDK = COMPILE_SDK;

  public static final String VERSION_NAME = "1.3.0";
  public static final int VERSION_CODE = 130;

  public static final String APP_COMPAT = "androidx.appcompat:appcompat:1.0.0";
  public static final String DESIGN = "com.google.android.material:material:1.0.0";
  public static final String RECYCLER_VIEW = "androidx.recyclerview:recyclerview:1.0.0";
  public static final String CARD_VIEW = "androidx.cardview:cardview:1.0.0";
  public static final String SUPPORT_ANNOTATION = "androidx.annotations:annotations:1.0.0";

  public static final String USER_ORG = "devahamed";
  public static final String GROUP_ID = "com.github.devahamed";
  public static final String REPO_NAME = "MultiViewAdapter";
  public static final String PUBLISH_VERSION = VERSION_NAME;
  public static final String DESC =
      "Recyclerview Adapter library to create composable view holders";
  public static final String WEBSITE = "https://github.com/DevAhamed/MultiViewAdapter";

  public static final String ARTIFACT_ID_CORE = "multi-view-adapter";
  public static final String ARTIFACT_ID_DATA_BINDING = "multi-view-adapter-databinding";
}
