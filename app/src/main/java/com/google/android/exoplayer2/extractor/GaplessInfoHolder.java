package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.util.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class GaplessInfoHolder {

    /* renamed from: c */
    public static final Pattern f10863c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f10864a = -1;

    /* renamed from: b */
    public int f10865b = -1;

    /* renamed from: a */
    public final boolean m6422a(String str) {
        Matcher matcher = f10863c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i2 = Util.f14736a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f10864a = parseInt;
            this.f10865b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public boolean m6423b(Metadata metadata) {
        int i2 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f11986b;
            if (i2 >= entryArr.length) {
                return false;
            }
            Metadata.Entry entry = entryArr[i2];
            if (entry instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entry;
                if ("iTunSMPB".equals(commentFrame.f12050d) && m6422a(commentFrame.f12051e)) {
                    return true;
                }
            } else if (entry instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entry;
                if ("com.apple.iTunes".equals(internalFrame.f12062c) && "iTunSMPB".equals(internalFrame.f12063d) && m6422a(internalFrame.f12064e)) {
                    return true;
                }
            } else {
                continue;
            }
            i2++;
        }
    }
}
