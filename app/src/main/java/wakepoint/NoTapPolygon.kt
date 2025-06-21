/*
 * Copyright (C) 2018 George Stavrinos (Unlicense)
 * Copyright (C) 2025-present 6543 (GPL-3.0-or-later)
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package wakepoint

import android.view.MotionEvent
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Polygon

class NoTapPolygon(map: MapView?) : Polygon(map) {

    override fun onSingleTapConfirmed(e: MotionEvent, mapView: MapView): Boolean {
        return false
    }
}
