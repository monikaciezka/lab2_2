package edu.iis.mto.similarity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import edu.iis.mto.searcher.SequenceSearcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

class SimilarityFinderTest {

    @Test
    void testEmptySeq() {
        MockSequenceSearcher searcher = new MockSequenceSearcher();
        SimilarityFinder indexJaccard = new SimilarityFinder(searcher);
        int[] seq1 = {};
        int[] seq2 = {};
        assertThat(1.0d, Matchers.equalTo(indexJaccard.calculateJackardSimilarity(seq1, seq2)));

    }

}
