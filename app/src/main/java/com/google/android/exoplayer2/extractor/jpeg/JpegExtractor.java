package com.google.android.exoplayer2.extractor.jpeg;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.jpeg.MotionPhotoDescription;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class JpegExtractor implements Extractor {

    /* renamed from: b */
    public ExtractorOutput f10971b;

    /* renamed from: c */
    public int f10972c;

    /* renamed from: d */
    public int f10973d;

    /* renamed from: e */
    public int f10974e;

    /* renamed from: g */
    @Nullable
    public MotionPhotoMetadata f10976g;

    /* renamed from: h */
    public ExtractorInput f10977h;

    /* renamed from: i */
    public StartOffsetExtractorInput f10978i;

    /* renamed from: j */
    @Nullable
    public Mp4Extractor f10979j;

    /* renamed from: a */
    public final ParsableByteArray f10970a = new ParsableByteArray(6);

    /* renamed from: f */
    public long f10975f = -1;

    /* renamed from: a */
    public final void m6450a() {
        m6451d(new Metadata.Entry[0]);
        ExtractorOutput extractorOutput = this.f10971b;
        Objects.requireNonNull(extractorOutput);
        extractorOutput.mo6394h();
        this.f10971b.mo6393d(new SeekMap.Unseekable(-9223372036854775807L, 0L));
        this.f10972c = 6;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f10971b = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        if (j2 == 0) {
            this.f10972c = 0;
            this.f10979j = null;
        } else if (this.f10972c == 5) {
            Mp4Extractor mp4Extractor = this.f10979j;
            Objects.requireNonNull(mp4Extractor);
            mp4Extractor.mo6402c(j2, j3);
        }
    }

    /* renamed from: d */
    public final void m6451d(Metadata.Entry... entryArr) {
        ExtractorOutput extractorOutput = this.f10971b;
        Objects.requireNonNull(extractorOutput);
        TrackOutput mo6392b = extractorOutput.mo6392b(RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE, 4);
        Format.Builder builder = new Format.Builder();
        builder.f9686j = "image/jpeg";
        builder.f9685i = new Metadata(entryArr);
        mo6392b.mo6399e(builder.m5833a());
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        if (m6452f(extractorInput) != 65496) {
            return false;
        }
        int m6452f = m6452f(extractorInput);
        this.f10973d = m6452f;
        if (m6452f == 65504) {
            this.f10970a.m7631B(2);
            extractorInput.mo6386n(this.f10970a.f14698a, 0, 2);
            extractorInput.mo6380f(this.f10970a.m7662z() - 2);
            this.f10973d = m6452f(extractorInput);
        }
        if (this.f10973d != 65505) {
            return false;
        }
        extractorInput.mo6380f(2);
        this.f10970a.m7631B(6);
        extractorInput.mo6386n(this.f10970a.f14698a, 0, 6);
        return this.f10970a.m7658v() == 1165519206 && this.f10970a.m7662z() == 0;
    }

    /* renamed from: f */
    public final int m6452f(ExtractorInput extractorInput) throws IOException {
        this.f10970a.m7631B(2);
        extractorInput.mo6386n(this.f10970a.f14698a, 0, 2);
        return this.f10970a.m7662z();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    public int mo6404g(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        String m7651o;
        MotionPhotoDescription motionPhotoDescription;
        long j2;
        int i2 = this.f10972c;
        if (i2 == 0) {
            this.f10970a.m7631B(2);
            extractorInput.readFully(this.f10970a.f14698a, 0, 2);
            int m7662z = this.f10970a.m7662z();
            this.f10973d = m7662z;
            if (m7662z == 65498) {
                if (this.f10975f != -1) {
                    this.f10972c = 4;
                } else {
                    m6450a();
                }
            } else if ((m7662z < 65488 || m7662z > 65497) && m7662z != 65281) {
                this.f10972c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            this.f10970a.m7631B(2);
            extractorInput.readFully(this.f10970a.f14698a, 0, 2);
            this.f10974e = this.f10970a.m7662z() - 2;
            this.f10972c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f10978i == null || extractorInput != this.f10977h) {
                    this.f10977h = extractorInput;
                    this.f10978i = new StartOffsetExtractorInput(extractorInput, this.f10975f);
                }
                Mp4Extractor mp4Extractor = this.f10979j;
                Objects.requireNonNull(mp4Extractor);
                int mo6404g = mp4Extractor.mo6404g(this.f10978i, positionHolder);
                if (mo6404g == 1) {
                    positionHolder.f10871a += this.f10975f;
                }
                return mo6404g;
            }
            long position = extractorInput.getPosition();
            long j3 = this.f10975f;
            if (position != j3) {
                positionHolder.f10871a = j3;
                return 1;
            }
            if (extractorInput.mo6378d(this.f10970a.f14698a, 0, 1, true)) {
                extractorInput.mo6383j();
                if (this.f10979j == null) {
                    this.f10979j = new Mp4Extractor(0);
                }
                StartOffsetExtractorInput startOffsetExtractorInput = new StartOffsetExtractorInput(extractorInput, this.f10975f);
                this.f10978i = startOffsetExtractorInput;
                if (this.f10979j.mo6403e(startOffsetExtractorInput)) {
                    Mp4Extractor mp4Extractor2 = this.f10979j;
                    long j4 = this.f10975f;
                    ExtractorOutput extractorOutput = this.f10971b;
                    Objects.requireNonNull(extractorOutput);
                    mp4Extractor2.f11259r = new StartOffsetExtractorOutput(j4, extractorOutput);
                    MotionPhotoMetadata motionPhotoMetadata = this.f10976g;
                    Objects.requireNonNull(motionPhotoMetadata);
                    m6451d(motionPhotoMetadata);
                    this.f10972c = 5;
                } else {
                    m6450a();
                }
            } else {
                m6450a();
            }
            return 0;
        }
        if (this.f10973d == 65505) {
            ParsableByteArray parsableByteArray = new ParsableByteArray(this.f10974e);
            extractorInput.readFully(parsableByteArray.f14698a, 0, this.f10974e);
            if (this.f10976g == null && "http://ns.adobe.com/xap/1.0/".equals(parsableByteArray.m7651o()) && (m7651o = parsableByteArray.m7651o()) != null) {
                long length = extractorInput.getLength();
                MotionPhotoMetadata motionPhotoMetadata2 = null;
                if (length != -1) {
                    try {
                        motionPhotoDescription = XmpMotionPhotoDescriptionParser.m6453a(m7651o);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        motionPhotoDescription = null;
                    }
                    if (motionPhotoDescription != null && motionPhotoDescription.f10981b.size() >= 2) {
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        boolean z = false;
                        for (int size = motionPhotoDescription.f10981b.size() - 1; size >= 0; size--) {
                            MotionPhotoDescription.ContainerItem containerItem = motionPhotoDescription.f10981b.get(size);
                            z |= "video/mp4".equals(containerItem.f10982a);
                            if (size == 0) {
                                j2 = length - containerItem.f10984c;
                                length = 0;
                            } else {
                                long j9 = length - containerItem.f10983b;
                                j2 = length;
                                length = j9;
                            }
                            if (z && length != j2) {
                                j8 = j2 - length;
                                j7 = length;
                                z = false;
                            }
                            if (size == 0) {
                                j6 = j2;
                                j5 = length;
                            }
                        }
                        if (j7 != -1 && j8 != -1 && j5 != -1 && j6 != -1) {
                            motionPhotoMetadata2 = new MotionPhotoMetadata(j5, j6, motionPhotoDescription.f10980a, j7, j8);
                        }
                    }
                }
                this.f10976g = motionPhotoMetadata2;
                if (motionPhotoMetadata2 != null) {
                    this.f10975f = motionPhotoMetadata2.f12083e;
                }
            }
        } else {
            extractorInput.mo6384k(this.f10974e);
        }
        this.f10972c = 0;
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
        Mp4Extractor mp4Extractor = this.f10979j;
        if (mp4Extractor != null) {
            Objects.requireNonNull(mp4Extractor);
        }
    }
}
