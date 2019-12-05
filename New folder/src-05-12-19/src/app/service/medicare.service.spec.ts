import { TestBed } from '@angular/core/testing';

import { MedicareService } from './medicare.service';

describe('MedicareService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MedicareService = TestBed.get(MedicareService);
    expect(service).toBeTruthy();
  });
});
