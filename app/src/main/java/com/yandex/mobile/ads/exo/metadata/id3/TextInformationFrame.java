package com.yandex.mobile.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.o11;
import com.yandex.mobile.ads.impl.s91;
import com.yandex.mobile.ads.impl.sb0;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new C4756a();

    /* renamed from: b */
    @Nullable
    public final String f48122b;

    /* renamed from: c */
    public final String f48123c;

    /* renamed from: com.yandex.mobile.ads.exo.metadata.id3.TextInformationFrame$a */
    public class C4756a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame[] newArray(int i2) {
            return new TextInformationFrame[i2];
        }
    }

    public TextInformationFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f48122b = str2;
        this.f48123c = str3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame, com.yandex.mobile.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public final void mo22239a(sb0.C5738a c5738a) {
        char c2;
        String str = this.f48111a;
        Objects.requireNonNull(str);
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        try {
            switch (c2) {
                case 0:
                case '\n':
                    c5738a.m28181b(this.f48123c);
                    break;
                case 1:
                case 11:
                    c5738a.m28188e(this.f48123c);
                    break;
                case 2:
                case '\f':
                    c5738a.m28187d(Integer.valueOf(Integer.parseInt(this.f48123c.substring(2, 4)))).m28185c(Integer.valueOf(Integer.parseInt(this.f48123c.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    c5738a.m28184c(this.f48123c);
                    break;
                case 4:
                case 18:
                    c5738a.m28174a(this.f48123c);
                    break;
                case 5:
                case 19:
                    c5738a.m28190f(this.f48123c);
                    break;
                case 6:
                case 20:
                    String str2 = this.f48123c;
                    int i2 = s91.f54530a;
                    String[] split = str2.split("/", -1);
                    c5738a.m28201k(Integer.valueOf(Integer.parseInt(split[0]))).m28199j(split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null);
                    break;
                case 7:
                case 16:
                    c5738a.m28202l(this.f48123c);
                    break;
                case '\b':
                case 15:
                    c5738a.m28203m(this.f48123c);
                    break;
                case '\t':
                case 21:
                    c5738a.m28189e(Integer.valueOf(Integer.parseInt(this.f48123c)));
                    break;
                case '\r':
                    ArrayList m22254a = m22254a(this.f48123c);
                    int size = m22254a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c5738a.m28185c((Integer) m22254a.get(2));
                            }
                        }
                        c5738a.m28187d((Integer) m22254a.get(1));
                    }
                    c5738a.m28189e((Integer) m22254a.get(0));
                    break;
                case 14:
                    ArrayList m22254a2 = m22254a(this.f48123c);
                    int size2 = m22254a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c5738a.m28191f((Integer) m22254a2.get(2));
                            }
                        }
                        c5738a.m28193g((Integer) m22254a2.get(1));
                    }
                    c5738a.m28195h((Integer) m22254a2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return s91.m28112a(this.f48111a, textInformationFrame.f48111a) && s91.m28112a(this.f48122b, textInformationFrame.f48122b) && s91.m28112a(this.f48123c, textInformationFrame.f48123c);
    }

    public final int hashCode() {
        int m26984a = o11.m26984a(this.f48111a, 527, 31);
        String str = this.f48122b;
        int hashCode = (m26984a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f48123c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.yandex.mobile.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f48111a + ": description=" + this.f48122b + ": value=" + this.f48123c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f48111a);
        parcel.writeString(this.f48122b);
        parcel.writeString(this.f48123c);
    }

    public TextInformationFrame(Parcel parcel) {
        super((String) s91.m28101a(parcel.readString()));
        this.f48122b = parcel.readString();
        this.f48123c = (String) s91.m28101a(parcel.readString());
    }

    /* renamed from: a */
    private static ArrayList m22254a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }
}
