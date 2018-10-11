package org.rockthorum.mapstruct.mapstruct_demo.mapper.util;

import java.util.List;

public class IterableNonInterableUtil {
	@FirstElement
    public <T> T first( List<T> in ) {
        if ( in != null && !in.isEmpty() ) {
            return in.get( 0 );
        }
        else {
            return null;
        }
    }
}
