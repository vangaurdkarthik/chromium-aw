
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/interfaces/battery_status.mojom
//

package org.chromium.device.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;


public final class BatteryStatus extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public boolean charging;
    public double chargingTime;
    public double dischargingTime;
    public double level;

    private BatteryStatus(int version) {
        super(STRUCT_SIZE, version);
        this.charging = (boolean) true;
        this.chargingTime = (double) 0.0;
        this.dischargingTime = (double) Double.POSITIVE_INFINITY;
        this.level = (double) 1.0;
    }

    public BatteryStatus() {
        this(0);
    }

    public static BatteryStatus deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws DeserializationException on deserialization failure.
     */
    public static BatteryStatus deserialize(java.nio.ByteBuffer data) {
        if (data == null)
            return null;

        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static BatteryStatus decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        BatteryStatus result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            result = new BatteryStatus(mainDataHeader.elementsOrVersion);
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.charging = decoder0.readBoolean(8, 0);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.chargingTime = decoder0.readDouble(16);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.dischargingTime = decoder0.readDouble(24);
            }
            if (mainDataHeader.elementsOrVersion >= 0) {
                
                result.level = decoder0.readDouble(32);
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
        
        encoder0.encode(this.charging, 8, 0);
        
        encoder0.encode(this.chargingTime, 16);
        
        encoder0.encode(this.dischargingTime, 24);
        
        encoder0.encode(this.level, 32);
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
        BatteryStatus other = (BatteryStatus) object;
        if (this.charging!= other.charging)
            return false;
        if (this.chargingTime!= other.chargingTime)
            return false;
        if (this.dischargingTime!= other.dischargingTime)
            return false;
        if (this.level!= other.level)
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
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.charging);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.chargingTime);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.dischargingTime);
        result = prime * result + org.chromium.mojo.bindings.BindingsHelper.hashCode(this.level);
        return result;
    }
}