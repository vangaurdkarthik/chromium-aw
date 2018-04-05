
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/shape_detection/public/interfaces/facedetection.mojom
//

package org.chromium.shape_detection.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public interface FaceDetection extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends FaceDetection, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FaceDetection, Proxy> MANAGER = FaceDetection_Internal.MANAGER;


    void detect(
            org.chromium.skia.mojom.Bitmap bitmapData,
            DetectResponse callback);

    interface DetectResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<FaceDetectionResult[]> { }


}
