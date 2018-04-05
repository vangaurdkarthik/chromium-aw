
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/interfaces/android_overlay.mojom
//

package org.chromium.media.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public final class AndroidOverlayConfig extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 32;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(32, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.mojo.common.mojom.UnguessableToken routingToken;
    public org.chromium.gfx.mojom.Rect rect;
    public boolean secure;

    private AndroidOverlayConfig(int version) {
        super(STRUCT_SIZE, version);
    }

    public AndroidOverlayConfig() {
        this(0);
    }

    public static AndroidOverlayConfig deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws DeserializationException on deserialization failure.
     */
    public static AndroidOverlayConfig deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static AndroidOverlayConfig decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        AndroidOverlayConfig result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new AndroidOverlayConfig(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.routingToken = org.chromium.mojo.common.mojom.UnguessableToken.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(16, false);
                result.rect = org.chromium.gfx.mojom.Rect.decode(decoder1);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.secure = decoder0.readBoolean(24, 0);
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        encoder0.encode(this.routingToken, 8, false);
        
        encoder0.encode(this.rect, 16, false);
        
        encoder0.encode(this.secure, 24, 0);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        AndroidOverlayConfig other = (AndroidOverlayConfig) object;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.routingToken, other.routingToken))
            return false;
        if (!org.chromium.mojo.bindings.BindingsHelper.equals(this.rect, other.rect))
            return false;
        if (this.secure!= other.secure)
            return false;
        return true;
    }

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = prime + getClass().hashCode();
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.routingToken);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.rect);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.secure);
        return result;
    }
}