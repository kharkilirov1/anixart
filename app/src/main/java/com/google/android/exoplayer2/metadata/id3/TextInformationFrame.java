package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Parcelable.Creator<TextInformationFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.1
        @Override // android.os.Parcelable.Creator
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TextInformationFrame[] newArray(int i2) {
            return new TextInformationFrame[i2];
        }
    };

    /* renamed from: c */
    @Nullable
    public final String f12072c;

    /* renamed from: d */
    public final String f12073d;

    public TextInformationFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f12072c = str2;
        this.f12073d = str3;
    }

    /* renamed from: a */
    public static List<Integer> m6732a(String str) {
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    /* renamed from: b */
    public void mo6699b(MediaMetadata.Builder builder) {
        String str = this.f12061b;
        Objects.requireNonNull(str);
        char c2 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c2 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c2 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c2 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c2 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c2 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c2 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c2 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c2 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c2 = 11;
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c2 = '\r';
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c2 = 14;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c2 = 15;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c2 = 16;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c2 = 17;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c2 = 18;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c2 = 19;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c2 = 20;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c2 = 21;
                    break;
                }
                break;
        }
        try {
            switch (c2) {
                case 0:
                case '\n':
                    builder.f9833c = this.f12073d;
                    break;
                case 1:
                case 11:
                    builder.f9855y = this.f12073d;
                    break;
                case 2:
                case '\f':
                    int parseInt = Integer.parseInt(this.f12073d.substring(2, 4));
                    int parseInt2 = Integer.parseInt(this.f12073d.substring(0, 2));
                    builder.f9849s = Integer.valueOf(parseInt);
                    builder.f9850t = Integer.valueOf(parseInt2);
                    break;
                case 3:
                case 17:
                    builder.f9832b = this.f12073d;
                    break;
                case 4:
                case 18:
                    builder.f9834d = this.f12073d;
                    break;
                case 5:
                case 19:
                    builder.f9856z = this.f12073d;
                    break;
                case 6:
                case 20:
                    String[] m7725X = Util.m7725X(this.f12073d, "/");
                    int parseInt3 = Integer.parseInt(m7725X[0]);
                    Integer valueOf = m7725X.length > 1 ? Integer.valueOf(Integer.parseInt(m7725X[1])) : null;
                    builder.f9844n = Integer.valueOf(parseInt3);
                    builder.f9845o = valueOf;
                    break;
                case 7:
                case 16:
                    builder.f9831a = this.f12073d;
                    break;
                case '\b':
                case 15:
                    builder.f9854x = this.f12073d;
                    break;
                case '\t':
                case 21:
                    builder.f9848r = Integer.valueOf(Integer.parseInt(this.f12073d));
                    break;
                case '\r':
                    ArrayList arrayList = (ArrayList) m6732a(this.f12073d);
                    int size = arrayList.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                builder.f9850t = (Integer) arrayList.get(2);
                            }
                        }
                        builder.f9849s = (Integer) arrayList.get(1);
                    }
                    builder.f9848r = (Integer) arrayList.get(0);
                    break;
                case 14:
                    ArrayList arrayList2 = (ArrayList) m6732a(this.f12073d);
                    int size2 = arrayList2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                builder.f9853w = (Integer) arrayList2.get(2);
                            }
                        }
                        builder.f9852v = (Integer) arrayList2.get(1);
                    }
                    builder.f9851u = (Integer) arrayList2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return Util.m7728a(this.f12061b, textInformationFrame.f12061b) && Util.m7728a(this.f12072c, textInformationFrame.f12072c) && Util.m7728a(this.f12073d, textInformationFrame.f12073d);
    }

    public int hashCode() {
        int m4107f = C0576a.m4107f(this.f12061b, 527, 31);
        String str = this.f12072c;
        int hashCode = (m4107f + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12073d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f12061b;
        String str2 = this.f12072c;
        String str3 = this.f12073d;
        StringBuilder m4122u = C0576a.m4122u(C0576a.m4106e(str3, C0576a.m4106e(str2, C0576a.m4106e(str, 22))), str, ": description=", str2, ": value=");
        m4122u.append(str3);
        return m4122u.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f12061b);
        parcel.writeString(this.f12072c);
        parcel.writeString(this.f12073d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInformationFrame(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.exoplayer2.util.Util.f14736a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f12072c = r0
            java.lang.String r3 = r3.readString()
            r2.f12073d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.TextInformationFrame.<init>(android.os.Parcel):void");
    }
}
