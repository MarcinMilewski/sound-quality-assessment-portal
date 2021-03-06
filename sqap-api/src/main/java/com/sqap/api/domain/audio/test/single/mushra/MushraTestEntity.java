package com.sqap.api.domain.audio.test.single.mushra;

import com.sqap.api.domain.audio.test.base.TestType;
import com.sqap.api.domain.audio.test.sample.TestSampleEntity;
import com.sqap.api.domain.audio.test.single.TestEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "MUSHRA_TESTS")
@Getter
@PrimaryKeyJoinColumn(name="ID")
@NoArgsConstructor
public class MushraTestEntity extends TestEntity {

    @Column(name="TYPE")
    @Enumerated(EnumType.STRING)
    private TestType type = TestType.MUSHRA;

    public MushraTestEntity(Integer orderNumber, String name, String description, Integer repetitionsNumber, Set<TestSampleEntity> testSampleEntitySet) {
        super(orderNumber, name, description, testSampleEntitySet, repetitionsNumber);
    }
}

