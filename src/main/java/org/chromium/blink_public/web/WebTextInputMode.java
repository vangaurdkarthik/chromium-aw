
// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     third_party/WebKit/public/platform/WebTextInputMode.h

package org.chromium.blink_public.web;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    WebTextInputMode.DEFAULT, WebTextInputMode.VERBATIM, WebTextInputMode.LATIN,
    WebTextInputMode.LATIN_NAME, WebTextInputMode.LATIN_PROSE, WebTextInputMode.FULL_WIDTH_LATIN,
    WebTextInputMode.KANA, WebTextInputMode.KANA_NAME, WebTextInputMode.KATA_KANA,
    WebTextInputMode.NUMERIC, WebTextInputMode.TEL, WebTextInputMode.EMAIL, WebTextInputMode.URL,
    WebTextInputMode.MAX
})
@Retention(RetentionPolicy.SOURCE)
public @interface WebTextInputMode {
  int DEFAULT = 0;
  int VERBATIM = 1;
  int LATIN = 2;
  int LATIN_NAME = 3;
  int LATIN_PROSE = 4;
  int FULL_WIDTH_LATIN = 5;
  int KANA = 6;
  int KANA_NAME = 7;
  int KATA_KANA = 8;
  int NUMERIC = 9;
  int TEL = 10;
  int EMAIL = 11;
  int URL = 12;
  int MAX = 12;
}
