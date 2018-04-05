
// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../media/base/video_codecs.h

package org.chromium.media;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    VideoCodec.UNKNOWN_VIDEO_CODEC, VideoCodec.CODEC_H264, VideoCodec.CODEC_VC1,
    VideoCodec.CODEC_MPEG2, VideoCodec.CODEC_MPEG4, VideoCodec.CODEC_THEORA, VideoCodec.CODEC_VP8,
    VideoCodec.CODEC_VP9, VideoCodec.CODEC_HEVC, VideoCodec.CODEC_DOLBY_VISION,
    VideoCodec.VIDEO_CODEC_MAX
})
@Retention(RetentionPolicy.SOURCE)
public @interface VideoCodec {
  /**
   * These values are histogrammed over time; do not change their ordinal values.  When deleting a
   * codec replace it with a dummy value; when adding a codec, do so at the bottom (and update
   * VIDEO_CODEC_MAX).
   */
  int UNKNOWN_VIDEO_CODEC = 0;
  int CODEC_H264 = 1;
  int CODEC_VC1 = 2;
  int CODEC_MPEG2 = 3;
  int CODEC_MPEG4 = 4;
  int CODEC_THEORA = 5;
  int CODEC_VP8 = 6;
  int CODEC_VP9 = 7;
  int CODEC_HEVC = 8;
  int CODEC_DOLBY_VISION = 9;
  /**
   * DO NOT ADD RANDOM VIDEO CODECS! The only acceptable time to add a new codec is if there is
   * production code that uses said codec in the same CL.
   */
  int VIDEO_CODEC_MAX = 9;
}
