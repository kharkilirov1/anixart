package lecho.lib.hellocharts.formatter;

import android.util.Log;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import lecho.lib.hellocharts.util.FloatUtils;

/* loaded from: classes3.dex */
public class ValueFormatterHelper {

    /* renamed from: a */
    public char[] f68523a = new char[0];

    /* renamed from: b */
    public char[] f68524b = new char[0];

    /* renamed from: c */
    public char f68525c = '.';

    /* renamed from: a */
    public void m34429a() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        if (numberFormat instanceof DecimalFormat) {
            this.f68525c = ((DecimalFormat) numberFormat).getDecimalFormatSymbols().getDecimalSeparator();
        }
    }

    /* renamed from: b */
    public int m34430b(char[] cArr, float f2, int i2, char[] cArr2) {
        boolean z;
        float f3 = f2;
        int i3 = i2;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            if (length > cArr.length) {
                Log.w("ValueFormatterHelper", "Label length is larger than buffer size(64chars), some chars will be skipped!");
                length = cArr.length;
            }
            System.arraycopy(cArr2, 0, cArr, cArr.length - length, length);
            return length;
        }
        int length2 = cArr.length - this.f68523a.length;
        char c2 = this.f68525c;
        int[] iArr = FloatUtils.f68714a;
        int i5 = 1;
        if (i3 >= iArr.length) {
            cArr[length2 - 1] = '.';
        } else if (f3 == 0.0f) {
            cArr[length2 - 1] = '0';
        } else {
            if (f3 < 0.0f) {
                f3 = -f3;
                z = true;
            } else {
                z = false;
            }
            if (i3 > iArr.length) {
                i3 = iArr.length - 1;
            }
            long round = Math.round(f3 * iArr[i3]);
            int i6 = length2 - 1;
            int i7 = 0;
            while (true) {
                if (round == 0 && i7 >= i3 + 1) {
                    break;
                }
                char c3 = c2;
                int i8 = (int) (round % 10);
                round /= 10;
                int i9 = i6 - 1;
                cArr[i6] = (char) (i8 + 48);
                i7++;
                if (i7 == i3) {
                    i6 = i9 - 1;
                    cArr[i9] = c3;
                    i7++;
                } else {
                    i6 = i9;
                }
                c2 = c3;
                i4 = 0;
            }
            if (cArr[i6 + 1] == c2) {
                cArr[i6] = '0';
                i7++;
                i6--;
            }
            if (z) {
                cArr[i6] = '-';
                i7++;
            }
            i5 = i7;
        }
        char[] cArr3 = this.f68523a;
        if (cArr3.length > 0) {
            System.arraycopy(cArr3, i4, cArr, cArr.length - cArr3.length, cArr3.length);
        }
        char[] cArr4 = this.f68524b;
        if (cArr4.length > 0) {
            System.arraycopy(cArr4, i4, cArr, ((cArr.length - i5) - this.f68523a.length) - cArr4.length, cArr4.length);
        }
        return i5 + this.f68524b.length + this.f68523a.length;
    }
}
