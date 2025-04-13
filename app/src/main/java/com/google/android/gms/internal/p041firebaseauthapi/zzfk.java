package com.google.android.gms.internal.p041firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzfk {

    /* renamed from: a */
    public final SharedPreferences f16500a;

    public zzfk(Context context, String str) throws IOException {
        Context applicationContext = context.getApplicationContext();
        if (str == null) {
            this.f16500a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.f16500a = applicationContext.getSharedPreferences(str, 0);
        }
    }

    /* renamed from: a */
    public final byte[] m8954a() throws IOException {
        try {
            String string = this.f16500a.getString("GenericIdpKeyset", null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", "GenericIdpKeyset"));
            }
            if (string.length() % 2 != 0) {
                throw new IllegalArgumentException("Expected a string of even length");
            }
            int length = string.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 + i2;
                int digit = Character.digit(string.charAt(i3), 16);
                int digit2 = Character.digit(string.charAt(i3 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[i2] = (byte) ((digit * 16) + digit2);
            }
            return bArr;
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", "GenericIdpKeyset"));
        }
    }
}
